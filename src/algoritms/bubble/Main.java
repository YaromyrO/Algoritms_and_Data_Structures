package algoritms.bubble;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        Random r = new Random();
        int[] arr = new int[r.nextInt((20 - 5) + 1) + 5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(500);
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();

        bubble.sort(arr);

        for (int i : arr) {
            System.out.print("[" + i + "] ");
        }
    }
}
