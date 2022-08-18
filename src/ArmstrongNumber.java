import java.util.*;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, temp, i, last_digit, sum = 0;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            last_digit = temp % 10;
            sum += last_digit * last_digit * last_digit;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is armstrong");
        } else {
            System.out.println(num + " is not armstrong");
        }

    }
}
