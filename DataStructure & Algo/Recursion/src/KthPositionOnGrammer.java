public class KthPositionOnGrammer {
    public static int solve(int n, int k) {
        if (n == 1 && k == 1) {
            return 0;
        }
        int middle = (int) Math.pow(2, n - 1) / 2;
        if (middle > k) {
            return solve(n - 1, k);
        } else {
            return solve(n - 1, k - middle) == 1 ? 0 : 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(solve(4,6));
    }
}
