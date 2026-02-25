/*You are learning Java programming for the first time. 
In this problem, you will calculate the area of a rectangle.
A rectangle has two values: length and width.
The area tells how much space the rectangle covers.
The formula to calculate area is:
Area = length multiplied by width.
You must read both values from the user.
You must calculate the area using the formula.
Finally, you must print the result exactly as required.*/

import java.util.*;

public class Week2_prog1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("Area is: " +area);
    }
}