package functions_methods;

import java.util.Scanner;

public class FuncForFactorial {
    static int temp = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial :");
        int num = sc.nextInt();

        System.out.println("The Factorial of the " +num+ " is : "+Factorial(num));

    }

    static int Factorial(int a){
        for(int i = a; i>=1; i--){ //4
            temp = temp * i;
        }
       return temp; 
    }
   
        
}
