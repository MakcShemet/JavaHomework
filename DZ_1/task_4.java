// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package DZ_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        System.out.println("Введите ваше уравнение: ");
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine().replaceAll("[^0-9]", "");
        iScanner.close();
        int n = str.length();
        int num = Integer.parseInt(str);
        int x = num / (int) Math.pow(10, n/2);
        int e = num % (int) Math.pow(10, n/2);
        int c = e - x;
        if(c / 10 == c % 10) {
            int q = x / 10;
            int w = x % 10;
            int y = c / 10;
            System.out.printf("%d%d + %d%d = %d", q, y, y, w, e);
        }
        else {
            System.out.println("Решения для данного уравнения нет");
        }        
    }
}
