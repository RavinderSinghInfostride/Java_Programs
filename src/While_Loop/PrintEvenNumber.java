package While_Loop;

import java.util.*;

public class PrintEvenNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit, i;
        System.out.print("Enter the limit : ");
        limit = sc.nextInt();
        i = 1;
        while (i <= limit) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

