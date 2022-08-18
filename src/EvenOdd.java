import java.util.*;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, even, odd;
        System.out.print("Enter the number you want to check : ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print(num + " is even");
        } else {
            System.out.print(num + " is odd");
        }
    }
}
