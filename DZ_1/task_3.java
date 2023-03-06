// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package DZ_1;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Первое число: ");
        Scanner iScanner = new Scanner(System.in);
        int x = iScanner.nextInt();
        System.out.println("Действие (+, -, /, *): ");
        char calcChar = (char) System.in.read();
        System.out.println("Второе число: ");
        int y = iScanner.nextInt();
        iScanner.close();
        int result = 0;
        switch(calcChar) { 
            case '+': 
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '/':
                result = x / y;
                break;
            case '*':
                result = x * y;
                break;
        }
        System.out.printf("%d %c %d = %d", x, (char) calcChar, y, result);        
    }
}
