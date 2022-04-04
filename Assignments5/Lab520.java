
import java.util.Scanner;

public class Lab520 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int idx, length, target, flag;
		int[] numbers = { 45, 20, 30, 35, 10 };

		flag = 0;
		boolean targetFound = false;
		target = scnr.nextInt();
		length = numbers.length;

		for (idx = 0; idx < length; idx++) {
			if (numbers[idx] == target) {
				targetFound = true;
				break;
			}
		}
		// flag = idx;
		// for (int i = length - 1; i > idx; i--) {
		for (int i = idx; i < length - 1; i++) {
			// if (idx == 4) {
			// break;
			// }
			// numbers[flag] = numbers[flag + 1];
			numbers[i] = numbers[i + 1];
			// flag = flag + 1;
		}

		if (targetFound) {
			length = length - 1;
		}

		for (int i = 0; i < length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();

		scnr.close();
	}

}
