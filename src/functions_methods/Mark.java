/*If Percentage Marks > 90, Grade is A+
If 70 <= Percentage Marks <= 89, Grade is A
If 60 <= Percentage Marks <= 69, Grade is B
If 50 <= Percentage Marks <= 59, Grade is C
If Percentage Marks <= 40, Grade is D*/



package functions_methods;

import java.util.*;
public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the marks for subject 1 : ");
          int sub1 = sc.nextInt();
          System.out.println("Enter the marks for subject 2 : ");
          int sub2 = sc.nextInt();
          System.out.println("Enter the marks for subject 3 : ");
          int sub3 = sc.nextInt();
          System.out.println("Enter the marks for subject 4 : ");
          int sub4 = sc.nextInt();
          System.out.println("Enter the marks for subject 5 : ");
          int sub5 = sc.nextInt();

          double result = Percentage(sub1,sub2,sub3,sub4,sub5);

        if(result >90){
            System.out.println("Your Grade is A+");
        }
        else if(result >70 && result<89){
             System.out.println("Your Grade is A");
        }
        else if(result >60 && result<69){
             System.out.println("Your Grade is B");
        }
        else if(result >50 && result<59){
             System.out.println("Your Grade is C");
        }
        else{
            System.out.println("Your Grade is D");
        }
        
    }

    static double Percentage(int a, int b, int c, int d, int e){

        double totalMarks = a+b+c+d+e;
        System.out.println("Your Total Marks is :" +totalMarks);
        double percentage = (totalMarks/500) * 100;

        System.out.println("Your Percentage is :"+percentage);

        return percentage;

    }


    
}
