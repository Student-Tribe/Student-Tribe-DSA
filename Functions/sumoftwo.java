
import java.util.Scanner;

class sumoftwo {

    public static void main(String[] args) {
        sum();
        System.out.println(sum2(10, 20));
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    //pass by value 
    static int sum2(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
