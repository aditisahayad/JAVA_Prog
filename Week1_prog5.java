//Complete the code fragment that reads two integer inputs from keyboard and compute the quotient and remainder.

import java.util.*;

public class Week1_prog5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        float quotient, remainder;
        System.out.println("Enter the first integer");
        a = sc.nextInt();
        System.out.println("Enter the second integer");
        b = sc.nextInt();
        quotient = a/b;
        remainder = a%b;
        System.out.println("Finding Quotient and remainder of "+a+"and" +b+ "\nQuotient: " +quotient+ "\nRemainder: " +remainder);

    }
}