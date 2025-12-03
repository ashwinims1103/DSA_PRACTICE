package functions_methods;

import java.util.*;
public class EligibleToVote {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); 
        EligibleToVote(age);
    }

    static boolean EligibleToVote(int a){

        if(a>18){
            System.out.println("You are Eligible to Vote!!!");
            return true;
        }
        System.out.println("You are not Eligible to Vote!!!");
        return false;

    }
}
