
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value :");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }

        if (rev == temp) {
            System.out.println(temp + " " + "is an palindrome number");
        } else {
            System.out.println(temp + " " + "is not an palindrome number");
        }

    }
}
