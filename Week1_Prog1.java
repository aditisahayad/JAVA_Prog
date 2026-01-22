//Write a Java program to check if a given integer is even or odd.Print "Odd" if odd and "Even" if even.

import java.util.Scanner;

public class W01_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        // Check if the number is even or odd
        if((number/2)*2==number){
  System.out.print("Even");
}
       else{
  System.out.print("Odd");
}
      in.close();
    }
}
