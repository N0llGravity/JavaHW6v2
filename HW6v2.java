import java.util.*;

public class HW6v2 {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        Laptop laptop1 = new Laptop();
        laptop1.name = "laptop1";
        laptop1.ram = 8;
        laptop1.hdd_capacity = 512;
        laptop1.os = "Windows";
        laptop1.color = "Black";
        laptops.add(laptop1);

        Laptop laptop2 = new Laptop();
        laptop2.name = "laptop2";
        laptop2.ram = 16;
        laptop2.hdd_capacity = 1024;
        laptop2.os = "MacOS";
        laptop2.color = "Silver";
        laptops.add(laptop2);

        Laptop laptop3 = new Laptop();
        laptop3.name = "laptop3";
        laptop3.ram = 4;
        laptop3.hdd_capacity = 256;
        laptop3.os = "Linux";
        laptop3.color = "Red";
        laptops.add(laptop3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - ОЗУ\n" +
                "2 - Объём ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Map<String, Object> filter = new HashMap<>();
        switch (choice) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                int minRam = scanner.nextInt();
                System.out.println("Введите максимальное значение ОЗУ:");
                int maxRam = scanner.nextInt();
                filter.put("minRam", minRam);
                filter.put("maxRam", maxRam);
                break;
            case 2:
                System.out.println("Введите минимальный объём ЖД:");
                int minHdd = scanner.nextInt();
                System.out.println("Введите максимальный объём ЖД:");
                int maxHdd = scanner.nextInt();
                filter.put("minHdd", minHdd);
                filter.put("maxHdd", maxHdd);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.nextLine();
                filter.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                filter.put("color", color);
                break;
            default:
                System.out.println("Неверный выбор");
        }

        for (Laptop laptop : laptops) {
            boolean match = true;
            if (filter.containsKey("minRam") && laptop.ram < (int) filter.get("minRam")) {
                match = false;
            }
            if (filter.containsKey("maxRam") && laptop.ram > (int) filter.get("maxRam")) {
                match = false;
            }
if (filter.containsKey("minHdd") && laptop.hdd_capacity < (int) filter.get("minHdd")) {
    match = false;
}
if (filter.containsKey("maxHdd") && laptop.hdd_capacity > (int) filter.get("maxHdd")) {
    match = false;
}
if (filter.containsKey("os") && !laptop.os.equals(filter.get("os"))) {
    match = false;
}
if (filter.containsKey("color") && !laptop.color.equals(filter.get("color"))) {
    match = false;
}
if (match) {
    System.out.println(laptop);
}
}

scanner.close();
}
}