
class Palindromic {

    public static void main(String[] args) {
        int n = 5;
        int spaces = n - 1;
        int half = (n / 2) + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println("");
            spaces--;
        }
    }
}
