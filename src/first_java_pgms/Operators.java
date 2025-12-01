package first_java_pgms;

import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation: ");
        char c = sc.next().charAt(0);  
        //  sc.next().charAt(0);  next() method simply accepts the string but charAt(0) access the single element 
        sc.close();

        if(c == '+'){
            int add = num1 +num2;
            System.out.println("The Addition of the " + num1 + " and the " +num2 + " is " +add);
        }
        else if(c == '-'){
            int sub = num1 - num2;
            System.out.println("The Subtraction of the " + num1 + " and the " +num2 + " is " +sub);
        }
        else if(c == '*'){
           int mat = num1 * num2; 
           System.out.println("The multiplication of the " + num1 + " and the " +num2 + " is " +mat);
        }
        else if(c == '/'){
            int div = num1/num2;
            System.out.println("The Division of the " + num1 + " and the " +num2 + " is " +div);
        }
        else if(c == '%'){
            int rem = num1%num2;
            System.out.println("The remainder of the " + num1 + " and the " +num2 + " is " +rem);
        }
        else {
            System.out.println("Invalid Operation");
        }
        
        
        
        
        


    }
    
}
