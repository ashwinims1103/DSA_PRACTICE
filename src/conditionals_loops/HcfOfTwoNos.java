package conditionals_loops;

import java.util.*;

public class HcfOfTwoNos {
// 24, 18 => 24%18
// 18, 6 => 18%6
// 6, 0 => 6 is gcd // this logic is by Euclidean algorithm

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("To find HCF of two numbers");
        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = sc.nextInt();

        while(num2 != 0){
        int rem = num1%num2; //24%18 = 6
        num1 = num2;
        num2 =rem;

        }
        System.out.println("The HCF of two numbers is "+num1);
    }
}