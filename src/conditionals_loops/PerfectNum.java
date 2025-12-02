package conditionals_loops;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        factors(num1);
        
        
    }

    static void factors(int n){
        int add = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
               { 
                add = add + i;
            }
        }
        if(add == n){
            System.out.println("The number is the perfect number");
        }
        else{
            System.out.println("The number is not perfect number");
        }
        
    }
    
}
