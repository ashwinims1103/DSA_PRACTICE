package functions_methods;

import java.util.*;
public class Pythagoras {
    static int c = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          System.out.println("To find the Pythagoras : ");
          System.out.println("Enter the side of the right angled triangle :");
          int num = sc.nextInt();
          System.out.println("Enter the another side of the right angled triangle :");
          int num2 = sc.nextInt();
        
          System.out.println("The result of is : "+Pythagoras(num,num2));


    }

    static double Pythagoras(int a, int b){
        int result = c * c;
        result = a*a +b*b;

        return Math.sqrt(result);
    }
}
