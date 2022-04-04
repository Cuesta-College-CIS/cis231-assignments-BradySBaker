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

		minidx = 0;
		minval = numbers[1];
		for (int i = 1; i < 10; i++) { // find 2nd lowest value
			if (numbers[i] < minval) {
				minval = numbers[i];
				minidx = i;
			}
		}
		tmp = numbers[1]; // Switch lowest value with index [1] and print
		numbers[1] = numbers[minidx];
		numbers[minidx] = tmp;
		System.out.println(Arrays.toString(numbers));

		scnr.close();
	}

}