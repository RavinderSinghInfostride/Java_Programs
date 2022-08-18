import java.util.*;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, temp, i, last_digit, rev = 0;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        temp = num;
        while (num != 0) {
            last_digit = num % 10;
            rev = rev * 10 + last_digit;
            num = num / 10;
        }
        System.out.println("Reverse of " + temp + " is " + rev);
    }
}