
class Diamondwithno {

    public static void main(String[] args) {
        int n = 5;
        int lefthalf = n / 2;
        int righthalf = n / 2;
        int half = (n / 2) + 1;
        System.out.println(half);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

            }

            if (i < half) {
                lefthalf -= 1;
                righthalf += 1;
            } else {
                lefthalf += 1;
                righthalf -= 1;
            }
        }
    }
}
