package conditionals_loops;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year :");
    int year = sc.nextInt();

    if(year%4==0){
        if(year%100!=0){
            System.out.println("The Given year is leap year");
        }
        else if(year%400==0){
            System.out.println("The Given year is leap year");
        }
        else{
            System.out.println("The Given year is not a leap year");
        }

        
    }
    else{
        System.out.println("The Given year is not a leap year");
    }
    }
    
}
