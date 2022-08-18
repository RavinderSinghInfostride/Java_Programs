import java.util.*;

public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, temp, last_digit, rev = 0;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        temp = num;
        while (temp > 0) {
            last_digit = temp % 10;
            rev = rev * 10 + last_digit;
            temp = temp / 10;
        }
        if (num == rev) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " is not palindrome");
        }
    }
}
