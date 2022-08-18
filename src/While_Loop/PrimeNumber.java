package While_Loop;

import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, count = 0;
        System.out.print("Enter the umber you want to check : ");
        num = sc.nextInt();

        i = 1;
        while (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
