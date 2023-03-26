// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package DZ_4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task_2 {

    public static int getRandomNum() {
        Random random = new Random();
        int num = random.nextInt(20) + 1;
        return (int) num;
        }
    public static List<Integer> enqueue(LinkedList<Integer> list, int element) {
        list.addLast(element);
        return list;
    }
    public static Object dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }
    public static Object first(LinkedList<Integer> list) {
        return list.peekFirst();
    }
    public static void getMenu(LinkedList<Integer> list) {
        Scanner iScanner = new Scanner(System.in);
        String str = "Выберите необходимый пункт меню:\n 1 - поместить элемент в конец списка\n 2 - вернуть и удалить первый элемент списка\n 3 - вернуть первый элемент списка\n 0 - выход";        
        System.out.println(str);        
        int nav = iScanner.nextInt();        
        if(nav != 0){
        for (int i = nav; i != 0; i = iScanner.nextInt()) {  
            switch (i) {                
                case 1:
                    System.out.println("Введите элемент для добавления в конец списка: ");
                    int el = iScanner.nextInt();
                    System.out.println(enqueue(list, el));
                    break;
                case 2:
                    int x = (int) dequeue(list);
                    System.out.printf("Удален элемент %d\n", x);
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println(first(list));                    
                    break;
                default:
                    System.out.println("Такого пункта меню нет.");
                    break;
            }
            System.out.println("\n" + str);
        }
    }
        iScanner.close();
    }

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            list.add(getRandomNum());
        }
        System.out.println(list);
        getMenu(list);
    }
}
