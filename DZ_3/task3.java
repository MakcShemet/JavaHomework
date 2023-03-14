package DZ_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class task3 {
        
    public static int getRandomNum() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        return (int) num;
        }
    
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 9; i++) {            
                list.add(getRandomNum());
            }
            System.out.println(list.toString()); 
            int min = list.get(0);
            int max = min;
            float mean = 0;            
            for (int i = 0; i < list.size(); i++) {
                if(min > list.get(i)) {
                    min = list.get(i);
                }
                if(max < list.get(i)) {
                    max = list.get(i);
                }
                mean += list.get(i);                
            }
            mean /= list.size();
            System.out.printf("Минимальное значение равно %d\nМаксимальное значение равно %d\nСреднее арифметическое равно %.2f", min, max, mean);
        }
}
