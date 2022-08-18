package Array;

import java.util.*;

public class LargestArrayElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length, i, largest, smallest;
        System.out.print("Enter the number of elements : ");
        length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the array elements");
        for (i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are : ");
        for (i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }

        largest = arr[0];
        for (i = 1; i < length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.print("The largest element of array is : " + largest);
    }
}
