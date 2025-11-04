
import java.util.Scanner;

class Panagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println(isPanagram(input));

    }

    static boolean isPanagram(String str) {
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }
        return true;
    }
}
