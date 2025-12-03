package functions_methods;

import java.util.*;

public class FuncForSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();

        System.out.println("The Sum of two numbers is "+ Sumofnos(num1,num2));
         System.out.println("The Product of two numbers is "+ Productofnos(num1,num2));
    }

    static int Sumofnos(int a, int b){
        int result = a+b;
        return result;
    }
    static int Productofnos(int a, int b){
        int result = a*b;
        return result;
    }
}
