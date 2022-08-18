import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, count = 0;
        System.out.print("Enter the umber you want to check : ");
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print(num + " is prime");
        } else {
            System.out.print(num + " is not prime");
        }
    }
}
