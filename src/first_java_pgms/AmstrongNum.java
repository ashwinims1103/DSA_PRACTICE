package first_java_pgms;

import java.util.*;

public class AmstrongNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number 1 : ");
    int num = sc.nextInt();
    int temp = num;
    int num_of_digits = 0;
    double result = 0;
    while(temp!=0){
       int quot = temp/10; // quot = 198  // 19 //1 
       temp = quot; //198 //19 //1 //0
       num_of_digits++; //1 //2 //3 //4
       System.out.println("Count of the given number is " +num_of_digits); //
       
    }
    temp = num;
    while(temp!=0){
    //    int quot = temp/10; // quot = 198  // 19 //1 
       int rem = temp%10;  //1987%10 = 7
       temp = temp/10; //198

       result = result + Math.pow(rem,num_of_digits) ;
    
       System.out.println("Result of the given number is " +result); //
       
    }
    if(num == result){
        System.out.println("The given number is the amstrong number ");
    }
    else{
        System.out.println("The given number is not the amstrong number ");
    }
 
    

}
}
