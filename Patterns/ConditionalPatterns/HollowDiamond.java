
public class HollowDiamond {

    public static void main(String[] args) {
        int n = 5;
        int half = (n / 2) + 1;
        int lefthalf = (n / 2) + 1;
        int righthalf = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {
            for (int c = 1; c <= n; c++) {
                if (c == lefthalf || c == righthalf) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i < half) {
                lefthalf--;
                righthalf++;
            } else {
                lefthalf++;
                righthalf--;
            }
            System.out.println();
        }
    }
}
