
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        boolean prime[] = new boolean[n + 1];
        prime(n, prime);
    }

    static void prime(int n, boolean[] prime) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        System.out.println("The prime numbers from 1 to " + n + " are");
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
    }
}
