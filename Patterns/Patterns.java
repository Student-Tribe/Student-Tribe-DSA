
import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        patternRightangleTriangle(n);
        patternSquare(n);
        patternInverseRightAngle(n);
        patternInverseLeftAngle(n);
    }

    static void patternRightangleTriangle(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    static void patternSquare(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void patternInverseRightAngle(int n) {
        for (int row = n; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternInverseLeftAngle(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces <= n - rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // static void butterflyPattern(int n)
    // {

    // }
}
