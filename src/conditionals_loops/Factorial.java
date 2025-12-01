package conditionals_loops;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial :");
        int num = sc.nextInt();
        int temp = 1;

        for(int i = num; i>=1; i--){ //4
            temp = temp * i;
           

        }
        System.out.println("The Factorial of the " +num+ "is : " +temp);
    }
    
}
