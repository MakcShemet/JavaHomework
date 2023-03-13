// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
package DZ_2;

import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("DZ_2\\log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] arr = new int[]{2, 6, 1, 8, 5, 3, 9, 7, 4};
        int tmp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }       
            } 
            logger.info(String.format("Sorted element %s in array ", arr[i]) + Arrays.toString(arr));           
        }
        System.out.println(Arrays.toString(arr));
    }
}
