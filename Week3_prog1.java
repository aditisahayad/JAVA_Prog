/* Write a program to print the factorial of a number by defining a recursive method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 1
(Remember to match the output given exactly, including the spaces and new lines)
(passed with presentation error means you will get full marks)
*/

import java.util.*;
class Week3_prog1{
    public static int factorial(int x){
        if(x==1||x==0)
        {
            return 1;
        }
        else{
            return x* factorial(x-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        x=sc.nextInt();
        System.out.println(factorial(x));
    }
}