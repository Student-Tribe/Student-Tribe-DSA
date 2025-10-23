
import java.util.Scanner;

class OneOddOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        int val = 0;
        for (int i = 0; i < n; i++) {
            val = val ^ arr[i];
        }
        System.out.println("The odd occurence number in the array " + val);
    }
}
