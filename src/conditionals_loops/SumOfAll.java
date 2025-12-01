package conditionals_loops;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        
        do{
            num = sc.nextInt();
            sum = sum +num;
            
        }
        while(num!=0);
         System.out.println("The sum of number is "+sum);   
        
        
        }

        
    }

