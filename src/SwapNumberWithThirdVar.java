import java.util.*;

public class SwapNumberWithThirdVar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();

        System.out.println("Beforw swapping num1 = " + num1 + " and num2 = " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping num1 = " + num1 + " and num2 = " + num2);
    }
}
