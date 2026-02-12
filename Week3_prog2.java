//There are two class cls1 and cls2 which is subclass of cls1.  cls1 having a method "add" which add two numbers. Create two method inside cls2 which will take 2 parameters as input i.e. a and b and print the sum , multiplication and sum of their squares i.e (a^2) + (b2).

import java.util.*;

class Week3_prog2{
    static class cls1{
        void add(int a, int b)
        {
            System.out.println(a+b);
        }
    }
    static class cls2 extends cls1{
        void mul(int a, int b){
            System.out.println(a*b);
        }
        void sos(int a, int b){
            System.out.println((a*a)+(b*b));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        cls2 obj = new cls2();
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.add(a,b);
        obj.mul(a,b);
        obj.sos(a,b);
    }
}