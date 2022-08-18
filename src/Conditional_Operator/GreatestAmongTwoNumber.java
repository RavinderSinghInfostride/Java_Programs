package Conditional_Operator;

import java.util.*;

public class GreatestAmongTwoNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        int greatest = (num1 > num2) ? (greatest = num1) : (greatest = num2);
        System.out.println("Greatest between " + num1 + " and " + num2 + " is " + greatest);
    }
}
