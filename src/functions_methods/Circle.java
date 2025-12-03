package functions_methods;

import java.util.*;
public class Circle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius :");
    int rad = input.nextInt();

    System.out.println("Area of circle is : " +areaofcircle(rad));
    System.out.println("circumference of circle is : " +circumferenceofcircle(rad));
    
    input.close();
        
    }

    static double areaofcircle(int a){
    double pi = 3.14;
    double result = pi * a * a;
    return result;
}

static double circumferenceofcircle(int a){
    double pi = 3.14;
    double result = 2 * pi * a;

    return result;
}
}
