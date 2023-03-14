package DZ_3;

import java.util.Arrays;

public class task1 {

    public static void mergeSort(int[] arrA, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] arrLeft = new int[mid];
        int[] arrRight = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            arrLeft[i] = arrA[i];
        }
        for (int i = mid; i < n; i++) {
            arrRight[i - mid] = arrA[i];
        }
        mergeSort(arrLeft, mid);
        mergeSort(arrRight, n - mid);
    
        merge(arrA, arrLeft, arrRight, mid, n - mid);
    }

    public static void merge(int[] arrA, int[] arrLeft, int[] arrRight, int left, int right) { 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (arrLeft[i] <= arrRight[j]) {
            arrA[k++] = arrLeft[i++];
        }
        else {
            arrA[k++] = arrRight[j++];
        }
    }
    while (i < left) {
        arrA[k++] = arrLeft[i++];
    }
    while (j < right) {
        arrA[k++] = arrRight[j++];
    }
}
        
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 1, 8, 5, 3, 9, 7, 4}; 
        System.out.println(Arrays.toString(arr));
        task1.mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));       
        
    }
}
