package conditionals_loops;

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("===============================================");
    System.out.println("Choose the Calculation you want to perform:");
    System.out.println("===============================================");
    System.out.println("1. Perimeter of Circle");
    System.out.println("2. Perimeter of Equilateral Traiangle");
    System.out.println("3. Perimeter of Parllelogram");
    System.out.println("4. Perimeter of Rectangle");
    System.out.println("5. Perimeter of Square");
    System.out.println("6. Perimeter of Rhombus");
    System.out.println("===============================================");
    
    int num1 = sc.nextInt();

    switch (num1) {
        case 1:
            circle(); 
            break;
        case 2:
            Equilateral_Triangle();
            break;
        case 3:
            Parllelogram();
            break;
        case 4:
            Rectangle();
            break;
        case 5:
            Square();
            break;
        case 6:
            Rhombus();
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
    double result = 2 * pi * rad;
    System.out.println("Perimeter of circle is : " +result);
}

public static void Equilateral_Triangle(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side value :");
    int side = input.nextInt();
    double result = 3 * side;
    System.out.println("Perimeter of Equilateral Triangle is : " +result);
}

public static void Parllelogram(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base value :");
    int base = input.nextInt();
    System.out.println("Enter the side value :");
    int side = input.nextInt();
    double result = 2 * (base + side);
    System.out.println("Perimeter of Parallelogram is : " +result);
}



public static void Rectangle(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length value :");
    int length = input.nextInt();
    System.out.println("Enter the breath value :");
    int breath = input.nextInt();
    double result =  2 * (length + breath);
    System.out.println("Perimeter of Rectangle is : " +result);
}

public static void Square(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side value :");
    int side = input.nextInt();
    double result = 4 * side;
    System.out.println("Perimeter of Square is : " +result);
}


public static void Rhombus(){
  Scanner input = new Scanner(System.in);
    System.out.println("Enter the side value :");
    int side = input.nextInt();
    double result = 4 * side;
    System.out.println("Perimeter of Rhombus is : " +result);
}


}
