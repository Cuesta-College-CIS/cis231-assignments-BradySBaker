import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int L = 3; // will NOT use L. Just for the extendability.
        final int M = 3;
        final int N = 2;
        int[][] matrix1 = { { 2, 5, 10 },
                { 3, 6, 9 },
                { 1, 2, 3 } };
        int[][] matrix2 = { { 10, 20 },
                { 30, 40 },
                { 50, 60 } };
        int rowidx = scnr.nextInt();

        // Your code
        int sum1 = 0;
        int sum2 = 0;
        if (rowidx == 0) { // If user chooses first row
            for (int i = 0; i < 3; i++) {
                sum1 = sum1 + (matrix1[0][i] * matrix2[i][0]);
                sum2 = sum2 + (matrix1[0][i] * matrix2[i][1]);
            }
        }
        System.out.println(sum1 + " " + sum2);
    }

}