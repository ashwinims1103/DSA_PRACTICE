package functions_methods;

import java.util.Scanner;

public class FuncForEvenOrOdd {
    public static void main(String[] args) {
        EvenOrOdd();     
    }

    static void EvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

}