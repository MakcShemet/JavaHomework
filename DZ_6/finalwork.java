package DZ_6;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class finalwork {
    public static void Filter(Set<Notebook> notebooks) {
        System.out.println("\nВведите параметр фильтра для поиска:\n1 - Объем ОЗУ\n2 - Объем жесткого диска\n3 - Операционная система\n4 - Цвет\n5 - Бренд\n0 - Выход.");
        Scanner iScanner = new Scanner(System.in);
        String nav = iScanner.nextLine();
        while (!nav.equals("0")) {
            switch (nav) {
                case "1":
                    System.out.println("Введите объем ОЗУ: 4, 8, 16 или 32 Гб.");
                    Integer ram = Integer.parseInt(iScanner.nextLine());
                    for (var element : notebooks) {
                        if (element.ram == ram)
                            System.out.println(element);
                    }
                    break;

                case "2":
                    System.out.println("Введите объем жесткого диска: 128, 256, 512 Гб.");
                    Integer volSD = Integer.parseInt(iScanner.nextLine());
                    for (var element : notebooks) {
                        if (element.volSD == volSD)
                            System.out.println(element);
                    }
                    break;

                case "3":
                    System.out.println("Введите наименование операционной системы: Windows, Linux, iOS");
                    String os = iScanner.nextLine().toLowerCase();
                    for (var element : notebooks) {
                        if (element.os.toLowerCase().equals(os))
                            System.out.println(element);
                    }
                    break;

                case "4":
                    System.out.println("Введите цвет ноутбука: черный, белый, серый, карсный.");
                    String color = iScanner.nextLine().toLowerCase();
                    for (var element : notebooks) {
                        if (element.color.toLowerCase().equals(color))
                            System.out.println(element);
                    }
                    break;
                case "5":
                    System.out.println("Введите бренд производителя: Apple, HP, Asus, Acer, Lenovo.");
                    String brand = iScanner.nextLine().toLowerCase();
                    for (var element : notebooks) {
                        if (element.brand.toLowerCase().equals(brand))
                            System.out.println(element);
                    }
                    break;
            }
            System.out.println(
                    "\nВведите параметр фильтра для поиска:\n1 - Объем ОЗУ\n2 - Объем жесткого диска\n3 - Операционная система\n4 - Цвет\n5 - Бренд\n0 - Выход.");
            nav = iScanner.nextLine();
        }
        iScanner.close();
    }

    public static void main(String[] args) {

        Notebook note1 = new Notebook(1, "Acer", 4, 128, "Linux", "серый");
        Notebook note2 = new Notebook(2, "HP", 8, 256, "Windows", "черный");
        Notebook note3 = new Notebook(3, "Asus", 32, 512, "Windows", "красный");
        Notebook note4 = new Notebook(4, "Lenovo", 16, 128, "Windows", "белый");
        Notebook note5 = new Notebook(5, "Aser", 32, 256, "Linux", "черный");
        Notebook note6 = new Notebook(6, "HP", 16, 128, "Windows", "белый");
        Notebook note7 = new Notebook(7, "Apple", 32, 512, "iOS", "серый");

        Set<Notebook> notebooks = new HashSet<Notebook>();
        notebooks.add(note1);
        notebooks.add(note2);
        notebooks.add(note3);
        notebooks.add(note4);
        notebooks.add(note5);
        notebooks.add(note6);
        notebooks.add(note7);

        Filter(notebooks);
    }
}
