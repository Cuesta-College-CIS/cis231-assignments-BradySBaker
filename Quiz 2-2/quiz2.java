import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class quiz2 {

    public static int[] constructArray(Scanner scnr) {

        Random rand = new Random();
        int[] tempArray = new int[scnr.nextInt()];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = rand.nextInt(99);
        }
        return tempArray;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array1;
        array1 = constructArray(scnr);
        System.out.println(Arrays.toString(array1));
    }
}
