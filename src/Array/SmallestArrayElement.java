package Array;

import java.util.*;

public class SmallestArrayElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length, i, smallest;
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

        smallest = arr[0];
        for (i = 0; i < length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element is " + smallest);
    }
}
