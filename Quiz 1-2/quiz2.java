import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[][] matrix1 = { { 2, 5, 10 },
                { 3, 6, 9 },
                { 1, 2, 3 } };
        int[][] matrix2 = { { 10, 20 },
                { 30, 40 },
                { 50, 60 } };
        int rowidx = scnr.nextInt();

        // Recommend use the for-loop to reduce the code
        final int M = 3;
        final int N = 2;
        int[] result = new int[N];
        for (int i = 0; i < N; i++)
            result[i] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i] += matrix1[rowidx][j] * matrix2[j][i];
            }
        }

        // Your code
        int sum1 = 0;
        int sum2 = 0;
        if (rowidx == 0) { // If user chooses first row
            for (int i = 0; i < 3; i++) {
                sum1 = sum1 + (matrix1[0][i] * matrix2[i][0]);
                sum2 = sum2 + (matrix1[0][i] * matrix2[i][1]);
                System.out.println(sum1 + ", " + sum2);
            }
        }
        sum1 = 0;
        sum2 = 0;
        if (rowidx == 1) { // If user chooses third row
            for (int i = 0; i < 3; i++) {
                sum1 = sum1 + (matrix1[1][i] * matrix2[i][0]);
                sum2 = sum2 + (matrix1[1][i] * matrix2[i][1]);
            }
            System.out.println(sum1 + ", " + sum2);
        }
        if (rowidx == 2) { // If user chooses second row
            for (int i = 0; i < 3; i++) {
                sum1 = sum1 + (matrix1[2][i] * matrix2[i][0]);
                sum2 = sum2 + (matrix1[2][i] * matrix2[i][1]);
            }
            System.out.println(sum1 + ", " + sum2);
        }
        scnr.close();
    }

}