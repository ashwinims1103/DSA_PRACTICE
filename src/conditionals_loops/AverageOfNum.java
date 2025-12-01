package conditionals_loops;

import java.util.*;

public class AverageOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number:");
        int n = sc.nextInt();
        int temp = 0;

        for(int i=0; i<n; i++){
        int nums = sc.nextInt();
        temp = temp + nums;
        }
        sc.close();

        int ans = temp/n;
        System.out.println("The average of the numbers are " +ans);

        
    }
    
}
