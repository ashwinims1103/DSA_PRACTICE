package first_java_pgms;

import java.math.BigInteger;
import java.util.*;

public class RstoUSDConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rupees :");
        long Rs = sc.nextLong();

        float USD = Rs / 64 ;
        System.out.print("The conversion of the " +Rs+ "in the dollars is " +USD);
    }
    
}
