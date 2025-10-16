
public class Diamond {

    public static void main(String[] args) {
        int n = 5;
        int half = (n / 2) + 1;
        int stars = 1;
        int spaces = half - 1;

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= spaces; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= stars; c++) {
                System.out.print("*");
            }
            System.out.println();
            if (r < half) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }
    }
}
