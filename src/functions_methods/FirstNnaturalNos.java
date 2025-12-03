package functions_methods;

import java.util.*;
public class FirstNnaturalNos {
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Number : ");
          int num = sc.nextInt();
          System.out.println("The sum of natural number till "+num+ " is "+SumOfAll(num));


    }
    static int SumOfAll(int a){
        int result = (a*(a+1))/2;
        return result;
    }
}
