
import java.util.*;

public class Primeno {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = c.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "-->" + isPrime(i));
        }
    }

    //checking prime numbers upto given range
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c <= Math.sqrt(n)) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
