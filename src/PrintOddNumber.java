import java.util.*;

public class PrintOddNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit, i;
        System.out.print("Enter the limit : ");
        limit = sc.nextInt();
        for (i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
