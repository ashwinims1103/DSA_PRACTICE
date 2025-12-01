package conditionals_loops;

import java.util.Scanner;

public class VolumeOfShapes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("=============================================== \nChoose the Calculation you want to perform:\n===============================================\n1. Volume of Cone\n2. Volume of Prism\n3. Volume of Cylinder\n4. Volume of Sphere\n5. Volume of Pyramid\n6. CSA of Cylinder\n7. TSA of Cylinder\n===============================================");

    // System.out.println("===============================================");
    // System.out.println("Choose the Calculation you want to perform:");
    // System.out.println("===============================================");
    // System.out.println("1. Volume of Cone");
    // System.out.println("2. Volume of Prism");
    // System.out.println("3. Volume of Cylinder");
    // System.out.println("4. Volume of Sphere");
    // System.out.println("5. Volume of Pyramid");
    // System.out.println("6. CSA of Cylinder");
    // System.out.println("7. TSA of Cylinder");

    // System.out.println("===============================================");
    
    int num1 = sc.nextInt();
    
    switch (num1) {
        case 1:
            Cone(); 
            break;
        case 2:
            Prism();
            break;
        case 3:
            Cylinder();
            break;
        case 4:
            Sphere();
            break;
        case 5:
            Pyramid();
            break;
        case 6:
            CSA_Cylinder();
            break;
        case 7:
            TSA_Cylinder();
            break;
    
        default:
            System.out.println("Enter the valid number");
            break;
    }
    }
    public static void Cone(){
    double pi = 3.14;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    int rad = input.nextInt();
    System.out.println("Enter the height :");
    int height = input.nextInt();
    double result = (pi * rad * rad * height)/3;
    System.out.println("Volume of Cone is : " +result);
    
}

public static void Prism(){
    double half = 0.5;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base value :");
    int base = input.nextInt();
    System.out.println("Enter the height value :");
    int height = input.nextInt();
    double result = half * base * height;
    System.out.println("Volume of Prism is : " +result);
}

public static void Cylinder(){
    double pi = 3.14;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    int rad = input.nextInt();
    System.out.println("Enter the height :");
    int height = input.nextInt();
    double result = pi * rad * rad *height;
    System.out.println("Volume of Cylinder is : " +result);
}

public static void Sphere(){
    double pi = 3.14;
    double constant = 1.3;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    int rad = input.nextInt();
    double result = constant * pi * rad *rad * rad;
    System.out.println("Volume of Sphere is : " +result);
}

public static void Pyramid(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length :");
    int length = input.nextInt();
    System.out.println("Enter the height :");
    int height = input.nextInt();
    System.out.println("Enter the width :");
    int width = input.nextInt();
    double result = (length * width * height)/3;
    System.out.println("Volume of Pyramid is : " +result);
}

public static void CSA_Cylinder(){
      double pi = 3.14;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    int rad = input.nextInt();
    System.out.println("Enter the height :");
    int height = input.nextInt();
    double result = 2 * pi * rad * height;
    System.out.println("CSA of Cylinder is : " +result);
}

public static void TSA_Cylinder(){
      double pi = 3.14;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    int rad = input.nextInt();
    System.out.println("Enter the height :");
    int height = input.nextInt();
    double result = 2 * pi * rad *(rad+ height);
    System.out.println("TSA of Cylinder is : " +result);
}
}
