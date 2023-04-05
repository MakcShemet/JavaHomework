package DZ_6;

public class Notebook {
    int id;
    String brand;
    int ram;
    int volSD;
    String os;
    String color;

    public Notebook(int id, String brand, int ram, int volSD, String os, String color) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.volSD = volSD;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s, ОЗУ: %d Гб, жесткий диск: %d Гб, операционная система: %s, цвет: %s", brand, ram, volSD, os, color);
    }
}