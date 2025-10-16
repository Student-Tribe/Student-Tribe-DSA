
import java.util.*;

public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        TreeSet<Integer> factors = new TreeSet<>();
        int i = 1;
        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                factors.add(n / i);
            }
        }
        System.out.println("Factors of " + n + " are:" + factors);
    }
}
