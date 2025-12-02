package conditionals_loops;

import java.util.Scanner;

public class SumofNegativeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int negative =0;
        int positive = 0;
        int positiveOdd=0;
        System.out.println("Enter the numbers :");

        do{
            
            num = sc.nextInt();
            if(num<0){
              negative += num;  
            }
            else{
                if(num%2==0){
                    positive+=num;
                }
                else{
                    positiveOdd+=num;
                }
            }
            
        }
        while(num!=0);

        System.out.println("The sum of positive even numbers are :"+positive);
        System.out.println("The sum of negative numbers are :"+negative);
        System.out.println("The sum of positive odd numbers are :"+positiveOdd);
        
        
        }
    }

