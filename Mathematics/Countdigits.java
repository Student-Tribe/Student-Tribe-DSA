
import java.util.*;

public class Countdigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i = i * 10) {
            count++;
        }
        System.out.println("The no of digits " + count);
    }
}
