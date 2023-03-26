// В калькулятор добавьте возможность отменить последнюю операцию.
// Дополнительно каскадная отмена - отмена нескольких операций
package DZ_4;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class task_3 {

    public static float summ(float x, int y) {
        return x + y;
    }

    public static float diff(float x, int y) {
        return x - y;
    }

    public static float sep(float x, int y) {
        return x / y;
    }

    public static float multi(float x, int y) {
        return x * y;
    }

    public static void main(String[] args) throws IOException {
        Stack<Float> stackResult = new Stack<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        float x = iScanner.nextInt();
        stackResult.push(x);

        while (stackResult.size() > 0) {
            System.out.print("Действие (+, -, /, *): ");
            String calc = iScanner.next();
            switch (calc) {
                case "+":
                    System.out.print("Второе число: ");
                    int y = iScanner.nextInt();
                    x = summ(x, y);
                    System.out.printf("Ответ: %.1f\n", x);
                    stackResult.push(x);
                    break;
                case "-":
                    System.out.print("Второе число: ");
                    y = iScanner.nextInt();
                    x = diff(x, y);
                    System.out.printf("Ответ: %.1f\n", x);
                    stackResult.push(x);
                    break;
                case "/":
                    System.out.print("Второе число: ");
                    y = iScanner.nextInt();
                    x = sep(x, y);
                    System.out.printf("Ответ: %.1f\n", x);
                    stackResult.push(x);
                    break;
                case "*":
                    System.out.print("Второе число: ");
                    y = iScanner.nextInt();
                    x = multi(x, y);
                    System.out.printf("Ответ: %.1f\n", x);
                    stackResult.push(x);
                    break;
                case "q":
                    if (stackResult.size() > 1) {
                        stackResult.remove(stackResult.size() - 1);
                        x = stackResult.peek();
                        System.out.printf("%.1f\n", x);
                    } else {
                        System.out.println(stackResult.peek());
                    }
                    break;
            }
        }
        iScanner.close();
    }
}
