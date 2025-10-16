
import java.util.*;

class DashedSwastik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int half = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j >= half) || (j == 1 && i <= half) || (i == half) || (j == half) || (i == n && j <= half)
                        || (j == n && i >= half)) {
                    if (i == 1 || i == half || i == n) {
                        System.out.print("- ");
                    } else {
                        System.out.print("| ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
