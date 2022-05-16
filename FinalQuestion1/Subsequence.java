package FinalQuestion1;

import java.util.Scanner;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int inputArray[] = new int[n];
        for (int i = 0; i < n; i++) { // Fills array with random numbers
            inputArray[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(inputArray));
        int idxMax = 0;
        int tempMax = 0;
        for (int i = 0; i < n; i++) { // Loop through Array
            int tempSum = 0;
            if (i + 2 < n) {
                tempSum = inputArray[i] + inputArray[i + 1] + inputArray[i + 2]; // Add 3 values together starting at i
            }
            if (tempSum > tempMax) { // If tempSum is greateter then all tempSums
                tempMax = tempSum;
                idxMax = i; // starting value equal to i
            }
        }
        System.out.println("Greatest Consecutive Values: " + inputArray[idxMax] + ", " + inputArray[idxMax + 1] + ", "
                + inputArray[idxMax + 2]);
    }
}
