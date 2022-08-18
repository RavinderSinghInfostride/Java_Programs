package Array;

import java.util.*;

public class InputOutputArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length, i;
        System.out.print("Enter the number of elements in array : ");
        length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the array elements : ");
        for (i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for (i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
