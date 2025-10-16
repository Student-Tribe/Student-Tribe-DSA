
import java.util.*;

class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int temp;
        int arr[] = new int[n];
        System.out.print("Enter elements into the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements before Sorting : ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("");
        System.out.println("Elements after sorting :");
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
               if(arr[j]>arr[j+1])
               {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               } 
            }

        }
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
