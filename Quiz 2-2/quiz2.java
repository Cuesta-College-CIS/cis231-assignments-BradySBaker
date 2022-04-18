import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class quiz2 {

    public static int[] constructArray(int length) {

        Random rand = new Random();
        int[] tempArray = new int[length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = rand.nextInt(100);
        }
        return tempArray;
    }

    public static void printArray(int[] printArray) {
        System.out.println(Arrays.toString(printArray));
    }

    public static int findMoreEvens(int[] n1, int[] n2) {
        int highestValue = 0;
        int n1Value = 0;
        int n2Value = 0;
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] % 2 == 0) {
                n1Value = n1Value + 1;
            }
            if (n2[i] % 2 == 0) {
                n2Value = n2Value + 1;
            }
        }
        if (n1Value > n2Value) {
            highestValue = 1;
        } else {
            highestValue = 2;
        }
        return highestValue;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array1;
        int[] array2;
        int arrayLength = scnr.nextInt();
        array1 = constructArray(arrayLength);
        array2 = constructArray(arrayLength);
        printArray(array1);
        printArray(array2);
        int highestValue = findMoreEvens(array1, array2);
        System.out.println("Array " + highestValue + " has more even numbers");
    }
}
