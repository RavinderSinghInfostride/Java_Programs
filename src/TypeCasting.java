import java.util.*;

public class TypeCasting {
    public static void main(String args[]) {
//        ----------------------Widening Type Casting----------------------
        System.out.println("Widening Type Casting");
        int numInt = 20;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);

//        ----------------------Narrowed Type Casting----------------------
        System.out.println("Narrowed Type Casting");
        double numDouble2 = 19.89d;
        int numInt2 = (int) numDouble2;
        System.out.println(numDouble2);
        System.out.println(numInt2);
    }
}
