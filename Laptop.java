public class Laptop {
    String name;
    int ram = 0;
    int hdd_capacity = 0;
    String os = "";
    String color = "";

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", hdd_capacity=" + hdd_capacity +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}