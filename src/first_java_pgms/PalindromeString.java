package first_java_pgms;

import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();
        int start = 0;
        int end = str.length()-1;

        while(start<=end){ //apple
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
                
            }
            else{
                 System.out.print("The given String is not palindrome");
                 break;
            }

        }
        if(start>end){
            System.out.print("The given String is the palindrome");
        }
    }

    
    
}
