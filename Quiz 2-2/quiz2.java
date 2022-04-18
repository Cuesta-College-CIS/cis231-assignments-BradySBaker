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

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array1;
        int[] array2;
        int arrayLength = scnr.nextInt();
        array1 = constructArray(arrayLength);
        array2 = constructArray(arrayLength);
        printArray(array1);
        printArray(array2);
    }
}
