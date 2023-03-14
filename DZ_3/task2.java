// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package DZ_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class task2 {
    
    public static int getRandomNum() {
    Random random = new Random();
    int num = random.nextInt(100) + 1;
    return (int) num;
    }

public static void main(String[] args) throws IOException {
    ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {            
            list.add(getRandomNum());
        }
        System.out.println(list.toString());      
        Iterator<Integer> lisIterator = list.iterator();
        while (lisIterator.hasNext()) {
            int nextNum = lisIterator.next();
            if(nextNum % 2 == 0) lisIterator.remove();
        }
        System.out.println(list.toString());
    }
}
