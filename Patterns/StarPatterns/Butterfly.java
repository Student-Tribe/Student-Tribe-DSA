
public class Butterfly {

    public static void main(String[] args) {
        int n = 3;

        int stars1 = 1;
        int stars2 = 1;
        int half = (n / 2) + 1;
        int spaces = half + 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= spaces; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= stars1; c++) {
                System.out.print("*");
            }
            for (int c = 1; c <= spaces; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= stars2; c++) {
                System.out.print("*");
            }
            System.out.println("");
            if (r > half) {
                spaces--;
            }
            stars1++;
            stars2++;
        }
    }
}
