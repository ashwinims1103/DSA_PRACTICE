package conditionals_loops;

import java.util.Scanner;

public class PalindromeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        palindrome(num);
       
    }
    static boolean palindrome(int num ){
         int result = 0;
        int temp = num;//121
        while(temp!=0){
            int rem = temp % 10; //1 //2 //1
            result = (result*10) + rem; //1 //12
            int quot = temp/10; //12 //1
            temp = quot; //12 //1
        }

        if(result == num){
            System.out.println("The Given number is palindrome");
            return true;
        }
        System.out.println("The Given number is not a palindrome");
        return false;
        
    }
}
