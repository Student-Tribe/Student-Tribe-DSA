
import java.util.Scanner;

class BreinsKeringhans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int temp = n;
        String s = Integer.toBinaryString(n);
        System.out.println("Binary value of " + n + ":" + s);
        int count = 0;
        while (n > 0) {
            n = n & n - 1;
            count += 1;
        }
        System.out.println("The no of Set bits in " + temp + " is " + count);
    }
}
