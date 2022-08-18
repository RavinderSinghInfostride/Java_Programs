package Conditional_Operator;

import java.util.*;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        String result = (num % 2 == 0) ? ("Even") : ("Odd");
        System.out.println(num + " is " + result);
    }
}
