package conditionals_loops;

import java.util.*;

public class DistBetween2Points{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values to find the distance between 2 points");  
        System.out.println("Enter the Value for X1 :");  
        int x1 = sc.nextInt();
        System.out.println("Enter the Value for x2 :");  
        int x2 = sc.nextInt();
        System.out.println("Enter the Value for y1 :");
        int y1 = sc.nextInt();
        System.out.println("Enter the Value for y2 :");  
        int y2 = sc.nextInt();


        double result = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println("The Distance between the two points are : "+result);
    }




}