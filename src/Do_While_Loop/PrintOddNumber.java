package Do_While_Loop;

import java.util.*;

public class PrintOddNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit, i;
        System.out.print("Enter the limit : ");
        limit = sc.nextInt();
        i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= limit);
    }
}
