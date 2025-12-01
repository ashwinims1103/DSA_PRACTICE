package first_java_pgms;

import java.util.*;

public class LargestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        
        sc.close();

        if(num1<num2){
            System.out.print("The Second number " +num2+ " is the largest number ");
        }
        else if(num1>num2){
            System.out.print("The First number " +num1+ " is the largest number ");
        }
        else {
            System.out.print("The First number " +num1+ " is Equal to the " +num2);
        }
    }
    
}
