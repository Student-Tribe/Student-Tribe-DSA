
import java.util.*;

public class Exponential {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value : ");
        int base = sc.nextInt();
        System.out.print("Enter exponent value : ");
        int exponent = sc.nextInt();

        for (int i = 1; i <= exponent; i++) {
            base *= base;
        }
        System.out.println(base + " power " + exponent + " = ");
    }
}
