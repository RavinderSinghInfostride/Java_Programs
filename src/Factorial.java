import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, fact = 1;
        System.out.print("Enter the number for which you want to calculate factorial : ");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }

//        -------------------------While loop------------------------
//        i = 1;
//        while (i <= num) {
//            fact = fact * i;
//            i++;
//        }

//        --------------------------Do while loop----------------------
//        i = 1;
//        do {
//            fact = fact * i;
//            i++;
//        } while (i <= num);

        System.out.print("The factorial of " + num + " is " + fact);
    }
}
