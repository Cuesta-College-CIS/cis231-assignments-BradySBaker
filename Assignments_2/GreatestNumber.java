package Assignments_2;

import java.util.Random;

public class GreatestNumber {
    public static void main(String[] args) {
        Random randGen = new Random();
        int num1 = randGen.nextInt(101);
        int num2 = randGen.nextInt(101);
        int num3 = randGen.nextInt(101);

        System.out.println("The generated random number: " + num1 + ", " + num2 + ", " + num3);

        if (num1 > num2) { // First IF
            if (num1 > num3) { // Inside first IF
                System.out.println("The greatest number:" + num1);
            } else { // Inside first if
                System.out.println("The greatest number:" + num3);
            }
        } else {
            if (num2 > num3) { // Inside first ELSE
                System.out.println("The greatest number:" + num2);
            } else {
                System.out.println("The greatest number:" + num3);
            }
        }
    }
}
