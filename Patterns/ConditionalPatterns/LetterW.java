
import java.util.*;

public class LetterW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int half = (n / 2) + 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if ((c == 1 || c == n) || (r == half && c == half) || (r > half && (c == r || c == (n - r + 1)))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
