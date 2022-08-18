package Do_While_Loop;

import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, fact = 1;
        System.out.print("Enter the number for which you want to calculate factorial : ");
        num = sc.nextInt();
        i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= num);
        System.out.print("The factorial of " + num + " is " + fact);
    }
}
