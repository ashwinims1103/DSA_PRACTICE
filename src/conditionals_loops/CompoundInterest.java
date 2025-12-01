package conditionals_loops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find the Compound Interest: ");
        System.out.println("Enter the Principal amount");
        int principal = sc.nextInt();
        System.out.println("Enter the Annual interest rate in percentage: ");
        int rate = sc.nextInt();
        System.out.println("Enter the number of times the interest is compounded per year: ");
        int number = sc.nextInt();
        System.out.println("Enter the amount of time in years: ");
        int time = sc.nextInt();

        double amount = principal*Math.pow((1+rate/number),(number*time));

        System.out.println("The compound interest of the given value is : "+amount);

    }
}
