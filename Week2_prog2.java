/*  Learning Operator Precedence

Problem Statement
This exercise teaches how Java evaluates expressions.
You will work with more than one arithmetic operator.
You will understand why brackets are important.
Incorrect placement of brackets can change the result.

The program receives two numbers.
You must combine them using addition and multiplication.
The focus of this question is expression formation, not input.
find perimeter of a rectangle*/

import java.util.*;

public class Week2_prog2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2*(length + breadth);
        System.out.println("Perimeter is: " +perimeter);
        sc.close();
    }
}