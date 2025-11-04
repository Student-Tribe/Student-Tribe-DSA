
import java.util.*;

class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 :");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String s2 = sc.nextLine();
        if (areAnagram(s1, s2) == true) {
            System.out.print("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1char = s1.toCharArray();
        char[] s2char = s2.toCharArray();
        Arrays.sort(s1char);
        Arrays.sort(s2char);
        return Arrays.equals(s1char, s2char);
    }
}
