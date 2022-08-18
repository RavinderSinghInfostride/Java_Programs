import java.util.*;

public class SwapNumberWithoutThirdVar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        System.out.println("Before Swapping : num1 = " + num1 + " and num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping : num1 = " + num1 + " and num2 = " + num2);
    }
}
