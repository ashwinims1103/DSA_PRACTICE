package conditionals_loops;

import java.util.*;
public class LcmOfTwoNos {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("To find LCM of two numbers");
        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = sc.nextInt(); 

       System.out.println("The BF method for LCM is "+bruteForceLcm(num1,num2)); 
       optimalsolution(num1, num2);
    

    }

    // BRUTE FORCE METHOD
    static int bruteForceLcm(int a, int b) {
        int multipleA = a;
        int multipleB = b;
 
        int i=0;
        while(multipleA != multipleB) {
            if(multipleA > multipleB) {
                multipleB += b;
            }
            else if(multipleA < multipleB) {
                multipleA += a;
            }
 
            // System.out.println("Iteration " + i +":==========");
            // System.out.println("Multiple of "+a+": "+multipleA);
            // System.out.println("Multiple of "+b+": "+multipleB);
            // System.out.println();
            i++;
            // if(i == 10) break;
        }
 
        return multipleA;
 
    }
    static void optimalsolution (int a, int b){
        int result = 0;
        int temp1 = a;
        int temp2 = b;
        while(b != 0){
        int rem = a%b; //24%18 = 6
        a = b;
        b =rem;

        }

        result = (temp1 * temp2)/a;

        System.out.println("The Optimal solution for LCM is : "+result);

    }

}
