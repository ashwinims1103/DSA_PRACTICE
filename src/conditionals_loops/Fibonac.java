package conditionals_loops;

import java.util.*;

public class Fibonac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("The fibonacci series is " + fibo(num));

    }

    static int fibo(int n){
        int a = 0;
        int b = 1;
        int f = 0;
        // int n = 0;
        
        if(n <= b){
            return n;
        }

        
        for(int i = 2; i<n; i++){
            f = a + b;
            a = b;
            b = f;

        }
        return f;
    }
}

    

