package Pattern;

import java.util.*;

public class FlyodTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows, i, j, k = 1;
        System.out.print("Enter number of rows : ");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}

