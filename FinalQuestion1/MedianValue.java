package FinalQuestion1;

import java.util.Scanner;
import java.util.Arrays;

public class MedianValue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int inputArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
