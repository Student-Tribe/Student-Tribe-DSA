
import java.util.*;

class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an  array  : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int temp, min;
        System.out.println("Enter array elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Before sorting :");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("After sorting :");
        for (int i = 0; i < n - i; i++) {

            min = i;
            for (int j = 1; j < n; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];

                }
            }
        }
    }
}
