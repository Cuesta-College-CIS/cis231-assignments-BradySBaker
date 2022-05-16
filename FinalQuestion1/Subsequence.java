package FinalQuestion1;

import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int inputArray[] = new int[n];
        for (int i = 0; i < n; i++) { // Fills array with random numbers
            inputArray[i] = (int) Math.floor(Math.random() * 100);
        }
    }
}
