package conditionals_loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        
        System.out.println("The factors of " + num1 + " are:" );
        factors(num1);
        
    }

    static void factors(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
               { 
                System.out.print(i + " ");
            }
        }
    }
}
