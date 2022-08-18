package Pattern;

import java.util.*;

public class RightPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, i, j;
        System.out.print("Enter the number of rows : ");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = rows-1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
