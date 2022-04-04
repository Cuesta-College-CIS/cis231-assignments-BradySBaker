package AssignmentsModule_3;

import java.util.Random;

public class AscendingOrder {
    public static void main(String[] args) {
        Random randGen = new Random();
        int num1 = randGen.nextInt(101);
        int num2 = randGen.nextInt(101);
        int num3 = randGen.nextInt(101);

        System.out.println("The generated random numbers: " + num1 + ", " + num2 + ", " + num3);

        if (num1 > num2) { // First IF
            if (num1 > num3) { // Inside IF
                if (num3 < num2) { // Inside 2nd IF
                    System.out.println("Sorted Order:" + num3 + " " + num2 + " " + num1);
                } else { // Inside 2nd If
                    System.out.println("Sorted Order:" + num2 + " " + num3 + " " + num1);
                }
            } else { // Inside if
                System.out.println("Sorted Order:" + num2 + " " + num1 + " " + num3);
            }
        }

        else {
            if (num2 > num3) { // Inside first ELSE
                if (num3 < num1) { // Inside IF & ELSE
                    System.out.println("Sorted Order:" + num3 + " " + num1 + " " + num2);
                } else { // ELSE & 2nd IF
                    System.out.println("Sorted Order:" + num1 + " " + num3 + " " + num2);
                }
            } else { // Inside ELSE
                System.out.println("Sorted Order:" + num1 + " " + num2 + " " + num3);
            }
        }
    }
}
