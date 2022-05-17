package FinalQuestion1;

import java.util.Scanner;
import java.util.Arrays;

public class MedianValue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int inputArray[] = new int[n];

        for (int i = 0; i < n; i++) { // Fills array with random numbers
            inputArray[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println("Orignal List: " + Arrays.toString(inputArray));
        Arrays.sort(inputArray); // Sort Array
        System.out.println("Sorted List: " + Arrays.toString(inputArray));
        int idxMid = (int) Math.ceil(n / 2); // Find mid value locaiton

        System.out.println("Median Value: " + inputArray[idxMid]); // Print out mid value
    }
}
