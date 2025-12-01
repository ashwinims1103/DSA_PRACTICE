package conditionals_loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number that you want to power :");
        int num1 = sc.nextInt();

        int result = num1 * num1;

        System.out.println("The Power of the given number is " +result);
    }
    
}
