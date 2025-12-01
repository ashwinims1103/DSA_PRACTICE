package first_java_pgms;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", welcome to the Java programming world!");
    }
}
