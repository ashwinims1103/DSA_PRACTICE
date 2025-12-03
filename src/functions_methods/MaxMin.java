package functions_methods;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        System.out.println("The Largest number among the 3 numbers is : "+max_num(num1,num2,num3));
        System.out.println("The Smallest number among the 3 numbers is : "+min_num(num1,num2,num3));
        
        sc.close();

        
    }

    static int max_num(int a, int b, int c){
        int temp = Math.max(a, b);
        int result = Math.max(temp,c);
        return result;
    }

    static int min_num(int a, int b, int c){
        int temp = Math.min(a, b);
        int result = Math.min(temp,c);
        return result;
    }
}
