package conditionals_loops;

import java.util.Scanner;

public class AdditionOfTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();
        int result = num1 +num2;

        System.out.println("Additon of " +num1+ " and " +num2+ " is " +result );
    }
}
