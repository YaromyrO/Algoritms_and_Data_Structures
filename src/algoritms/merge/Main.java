package algoritms.merge;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Merge merge = new Merge();
        Random r = new Random();
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(500);
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();

        merge.sort(arr);

        for (int i : arr) {
            System.out.print("[" + i + "] ");
        }

    }
}
