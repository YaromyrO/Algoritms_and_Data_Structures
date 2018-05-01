package algoritms.quicksort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        Random r = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();

        quickSort.sort(arr);

        for (int i : arr) {
            System.out.print("[" + i + "] ");
        }

    }
}
