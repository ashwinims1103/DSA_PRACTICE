package conditionals_loops;

import java.util.*;

public class MonthEven {
    static int sumofdays = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month:");
        String month = sc.nextLine().toLowerCase();

        switch (month) {
            case "january":  
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                oddMonth();
                break;

            case "april": 
            case "june":
            case "september":
            case "november":
                evenMonth();
                break;

            case "february": 
                febMonth();
                break;

            default:
                System.out.println("Invalid month");
        }
    }

    static void oddMonth() {  
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                sumofdays = sumofdays + 1;
            }
        }
        System.out.println("The even days in this month is : " + sumofdays);
    }

    static void evenMonth() {  
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                sumofdays = sumofdays + 1;
            }
        }
        System.out.println("The even days in this month is : " + sumofdays);
    }

    static void febMonth() {   
        for (int i = 1; i <= 28; i++) {
            if (i % 2 == 0) {
                sumofdays = sumofdays + 1;
            }
        }
        System.out.println("The even days in this month: " + sumofdays);
    }
}
