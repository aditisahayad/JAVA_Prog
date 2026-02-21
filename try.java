//Write a Java program to check if a given integer is even or odd.Print "Odd" if odd and "Even" if even.

import java.util.*;
public class try{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:: ");
    byte a = sc.nextByte();
    if(a%2==0){
      System.out.println(a+" is an even number");
    }else{
      System.out.println(a+ " is an odd number");
    }
  }
}


