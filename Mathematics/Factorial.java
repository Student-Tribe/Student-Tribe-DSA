
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = a.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            if (n == 0) {
                System.out.println("1");
            } else {
                factorial = factorial * i;
            }
        }
        System.out.println(factorial);
    }
}
