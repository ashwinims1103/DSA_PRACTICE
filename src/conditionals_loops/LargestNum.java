package conditionals_loops;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int max = Integer.MIN_VALUE;
        
        do{
            num = sc.nextInt();
            max = Math.max(num, max);
            
        }
        while(num!=0);
         System.out.println("The largest number is "+max);   
        
        
        }

            
}

    
 
    

