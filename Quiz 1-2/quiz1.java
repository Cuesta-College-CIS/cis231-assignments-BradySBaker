import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		final int CNT = 5;
		int minval, minidx, tmp;

		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = scnr.nextInt();
		}
		minidx = 0;
		minval = numbers[0];
		for (int i = 0; i < 10; i++) { // Find lowest value
			if (numbers[i] < minval) {
				minval = numbers[i];
				minidx = i;
			}
		}
		tmp = numbers[0]; // Switch lowest value with index [0] and print
		numbers[0] = numbers[minidx];
		numbers[minidx] = tmp;
		System.out.println(Arrays.toString(numbers));

		// Instead of the repeated redundant code
		// for-loop is recommended.
		// Check the below code segment
		for (int i = 0; i < CNT; i++) {
			minval = 0;
			minidx = -1;
			for (int j = i; j < N; j++) {
				if ((j == i) || (minval > numbers[j])) {
					minval = numbers[j];
					minidx = j;
				}
			}
			tmp = numbers[i];
			numbers[i] = numbers[minidx];
			numbers[minidx] = tmp;
			System.out.println(Arrays.toString(numbers));
		}
		// minidx = 1;
		// minval = numbers[1];
		// for (int i = 1; i < 10; i++) { // find 2nd lowest value
		// if (numbers[i] < minval) {
		// minval = numbers[i];
		// minidx = i;
		// }
		// }
		// tmp = numbers[1]; // Switch lowest value with index [1] and print
		// numbers[1] = numbers[minidx];
		// numbers[minidx] = tmp;
		// System.out.println(Arrays.toString(numbers));

		// minidx = 2;
		// minval = numbers[2];
		// for (int i = 2; i < 10; i++) { // find 3rd lowest value
		// if (numbers[i] < minval) {
		// minval = numbers[i];
		// minidx = i;
		// }
		// }
		// tmp = numbers[2]; // Switch lowest value with index [2] and print
		// numbers[2] = numbers[minidx];
		// numbers[minidx] = tmp;
		// System.out.println(Arrays.toString(numbers));

		// minidx = 3;
		// minval = numbers[3];
		// for (int i = 3; i < 10; i++) { // find 4th lowest value
		// if (numbers[i] < minval) {
		// minval = numbers[i];
		// minidx = i;
		// }
		// }
		// tmp = numbers[3]; // Switch lowest value with index [3] and print
		// numbers[3] = numbers[minidx];
		// numbers[minidx] = tmp;
		// System.out.println(Arrays.toString(numbers));

		// minidx = 4;
		// minval = numbers[4];
		// for (int i = 4; i < 10; i++) { // find 5th lowest value
		// if (numbers[i] < minval) {
		// minval = numbers[i];
		// minidx = i;
		// }
		// }
		// tmp = numbers[4]; // Switch lowest value with index [4] and print
		// numbers[4] = numbers[minidx];
		// numbers[minidx] = tmp;
		// System.out.println(Arrays.toString(numbers));

		scnr.close();
	}

}