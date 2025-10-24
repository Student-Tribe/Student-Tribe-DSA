
import java.util.Scanner;

class SetCombinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        //  System.out.println("The string is : " + str);
        char arr[] = str.toCharArray();
        System.out.print("Individual characters of the string  that is stored in array is [ ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("]");
        int max = (int) Math.pow(2, arr.length);
        // System.out.println(max);
        System.out.print("Possible set of combinations of given string " + str + "is [");
        for (int i = 0; i < max; i++) {
            String s = " ";
            int idx = 0;
            int bitmask = 1;
            while (bitmask < max) {
                if ((bitmask & i) != 0) {
                    s += arr[idx];
                }
                bitmask <<= 1;
                idx += 1;
            }
            System.out.print(s);
        }
        System.out.println("]");
    }

}
