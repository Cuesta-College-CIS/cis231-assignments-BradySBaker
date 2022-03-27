import java.util.Scanner;
import java.util.Arrays;

public class Lab525 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt(); // Row
		int M = scnr.nextInt(); // Column
		int sum = 0;
		int rowMin = 0;
		int rowMin_idx = 0;
		int rowMax = 0;
		int rowMax_idx = 0;
		int columnMin = 0;
		int columnMin_idx = 0;
		int columnMax = 0;
		int columnMax_idx = 0;

		int[][] numbers = new int[N][M];

		for (int i = 0; i < N; i++) { // Set array
			for (int j = 0; j < M; j++) {
				numbers[i][j] = scnr.nextInt();
			}
		}
		for (int i = 0; i < N; i++) { // For Rows
			sum = 0;
			for (int j = 0; j < M; j++) {
				sum = sum + numbers[i][j]; // Sum of Row
			}
			if (i == 0 || sum < rowMin) { // Set rowMin
				rowMin = sum;
				rowMin_idx = i;
			}
			if (i == 0 || sum > rowMax) { // Set rowMax
				rowMax = sum;
				rowMax_idx = i;
			}
		}

		for (int j = 0; j < M; j++) {
			sum = 0;
			for (int i = 0; i < numbers.length; i++) { // For Columns
				sum = sum + numbers[i][j];
			}
			if (j == 0 || sum < columnMin) { // Set column min
				columnMin = sum;
				columnMin_idx = j;
			}
			if (j == 0 || sum > columnMax) { // Set column max
				columnMax = sum;
				columnMax_idx = j;
			}
		}

		// for (int i = 0; i < N; i++) { // Print out smallest Row
		for (int j = 0; j < M; j++) {
			// if (i == rowMin_idx) {
			System.out.print(numbers[rowMin_idx][j] + " ");
			if (j == M - 1) {
				System.out.println();
				break;
			}
		}
		// }

		// for ( int i = 0; i < N; i++) { // Print out biggest Row
		for (int j = 0; j < M; j++) {
			// if (i == rowMax_idx) {
			System.out.print(numbers[rowMax_idx][j] + " ");
			if (j == M - 1) {
				System.out.println();
				break;
			}
		}
		// }
		// }
		// for (int j = 0; j < N; j++) {
		for (int i = 0; i < numbers.length; i++) { // Print out smallest column
			// if (j == columnMin_idx) {
			System.out.print(numbers[i][columnMax_idx] + " ");
			if (i == N - 1) {
				System.out.println();
				break;
			}
		}
		// }
		// }
		// for (int j = 0; j < M; j++) {
		for (int i = 0; i < numbers.length; i++) { // Print out biggest column
			// if (j == columnMax_idx) {
			System.out.print(numbers[i][columnMin_idx] + " ");
			if (i == N - 1) {
				System.out.println();
				break;
			}
		}
		// }
		// }
	}
}
