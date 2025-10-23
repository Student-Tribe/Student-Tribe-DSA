
import java.util.Scanner;

class Setunset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        System.out.println("Binary value of " + n + ":" + s);
        System.out.print("Enter position value :");
        int pos = sc.nextInt();
        int bitmask = 1 << (pos - 1);
        System.out.println(bitmask);
        if ((bitmask & n) != 0) {
            System.out.println("Bit is Set");
        } else {
            System.out.println("Bit is Unset");
        }
    }
}
