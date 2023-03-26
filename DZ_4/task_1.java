// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
package DZ_4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task_1 {

    public static List<Object> reversList(LinkedList list) {       
        LinkedList<Object> reverslist = new LinkedList<>(); // Используем тип данных Object для универсальности метода
        for (int j = list.size() - 1; j >= 0; j--) {
            reverslist.addLast(list.get(j));
        }
        return reverslist;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер массива (целое положительное число): ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();
        LinkedList<String> list = new LinkedList<>(); // Может быть задан любой <тип данных> для списка
        for(int i = 0; i < n; i++) {
            list.add("text-" + i);
        }
        System.out.println(list);
        System.out.println(reversList(list));        
    }
}
