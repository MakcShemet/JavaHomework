// Вывести все простые числа от 1 до 1000

package DZ_1;
public class task_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;
        System.out.printf("%d %d %d ", a, b, c);
        for (int i = 2; i < 1000; i++) {
            if(i % 2 != 0 & i % 3 != 0 & i % 4 != 0 & i % 5 != 0)
            System.out.printf("%d ", i);
            
        } 
    }
}
