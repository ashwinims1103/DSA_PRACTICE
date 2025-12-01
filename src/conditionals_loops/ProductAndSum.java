package conditionals_loops;

import java.util.Scanner;


public class ProductAndSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();  
    int sum = 0;
    int multiplication = 1;
    int result = 0;
    while(num!=0){ //123 //
       int rem = num%10; //3
       multiplication = rem*multiplication; //3
       sum = rem +sum;//3
       int quot = num/10;
       num = quot;
      
       
    }
    result = multiplication - sum;
    System.out.println("The final answer is " +result);
    }
    
    
    
}
