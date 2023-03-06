/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */

package DZ_1;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите целое натуральное число: ");
        boolean flag = myScanner.hasNextInt();
        System.out.println(flag);
        int n = myScanner.nextInt();
        int triangular = 1;
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            triangular += i;
            factorial *= i;
        }
        System.out.printf("Треугольное число от %d равен %d\n", n, triangular);
        System.out.printf("Факториал числа %d равен %d\n", n, factorial);
        myScanner.close();
    }
}