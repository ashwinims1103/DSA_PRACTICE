package conditionals_loops;

import java.util.*;

public class AreaOfShapes{

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("===============================================");
    System.out.println("Choose the Calculation you want to perform:");
    System.out.println("===============================================");
    System.out.println("1. Area of Circle");
    System.out.println("2. Area of Triangle");
    System.out.println("3. Area of Rectangle");
    System.out.println("4. Area of Isoceles Triangle");
    System.out.println("5. Area of Parllelogram");
    System.out.println("6. Area of Rhombus");
    System.out.println("7. Area of Equilateral Traiangle");
    System.out.println("===============================================");
    
    int num1 = sc.nextInt();

    switch (num1) {
        case 1:
            circle(); 
            break;
        case 2:
            Triangle();
            break;
        case 3:
            Rectangle();
            break;
        case 4:
            Isoceles_Triangle();
            break;
        case 5:
            Parllelogram();
            break;
        case 6:
            Rhombus();
            break;
        case 7:
            Equilateral_Triangle();
            break;
    
        default:
            System.out.println("Enter the valid number");
            break;
    }


    
}
public static void circle(){
    double pi = 3.14;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    int rad = input.nextInt();
    double result = pi * rad * rad;
    System.out.println("Area of circle is : " +result);
}

public static void Triangle(){
    double half = 0.5;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base value :");
    int base = input.nextInt();
    System.out.println("Enter the height value :");
    int height = input.nextInt();
    double result = half * base * height;
    System.out.println("Area of Triangle is : " +result);
}

public static void Rectangle(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length value :");
    int length = input.nextInt();
    System.out.println("Enter the breath value :");
    int breath = input.nextInt();
    double result = length * breath;
    System.out.println("Area of Triangle is : " +result);
}

public static void Isoceles_Triangle(){
    double half = 0.5;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base value :");
    int base = input.nextInt();
    System.out.println("Enter the height value :");
    int height = input.nextInt();
    double result = half * base * height;
    System.out.println("Area of Isosceles Triangle is : " +result);
}

public static void Parllelogram(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base value :");
    int base = input.nextInt();
    System.out.println("Enter the height value :");
    int height = input.nextInt();
    double result = base * height;
    System.out.println("Area of Parallelogram is : " +result);
}

public static void Rhombus(){
    double half = 0.5;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Diagonal value 1 :");
    int diag1 = input.nextInt();
    System.out.println("Enter the Diagonal value 2 :");
    int diag2 = input.nextInt();
    double result = half * diag1 * diag2;
    System.out.println("Area of Rhombus is : " +result);
}

public static void Equilateral_Triangle(){
    double half = 0.5;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base value :");
    int base = input.nextInt();
    System.out.println("Enter the height value :");
    int height = input.nextInt();
    double result = half * base * height;
    System.out.println("Area of Equilateral Triangle is : " +result);
}


}