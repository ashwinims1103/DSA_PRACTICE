package conditionals_loops;

import java.util.*;
public class SumofDigitsofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num!=0){ //123
            int rem = num%10;
            sum = sum +rem;
            int quot = num/10;
            num = quot;
        }
        System.out.println("The sum of the given number is "+sum);

    }
}
