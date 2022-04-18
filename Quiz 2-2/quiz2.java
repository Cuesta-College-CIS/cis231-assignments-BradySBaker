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
        } else if (n1Value == n2Value) {
            highestValue = 3;
        } else {
            highestValue = 2;
        }
        return highestValue;
    }

    public static int[] findGreatest(int[] n1, int[] n2) {
        int[] greatestValue = new int[2];
        int n1Value = 0;
        int n2Value = 0;
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] > n1Value) {
                n1Value = n1[i];
            }
            if (n2[i] > n2Value) {
                n2Value = n2[i];
            }
        }
        if (n1Value > n2Value) {
            greatestValue[0] = n1Value;
            greatestValue[1] = 1;
        } else if (n1Value == n2Value) {
            greatestValue[0] = n1Value;
            greatestValue[1] = 3;
        } else {
            greatestValue[0] = n2Value;
            greatestValue[1] = 2;
        }
        return greatestValue;
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

        String highestArray = new String();

        if (highestValue == 1) {
            highestArray = "Array 1 has more even numbers";
        } else if (highestValue == 2) {
            highestArray = "Array 2 has more even numbers";
        } else {
            highestArray = "Both Arrays have the same amount of even numbers";
        }

        System.out.println(highestArray);

        int[] greatestValue = findGreatest(array1, array2);

        String greatestArray = new String();
        if (greatestValue[1] == 3) {
            greatestArray = "Both Arrays have";
        } else if (greatestValue[1] == 1) {
            greatestArray = "Array 1 has";
        } else {
            greatestArray = "Array 2 has";
        }

        System.out.println(greatestArray + " the greatest value " + greatestValue[0]);
    }
}
