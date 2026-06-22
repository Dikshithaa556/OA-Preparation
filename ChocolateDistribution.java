public class ChocolateDistribution {

    static final long MOD = 1000000007;

    public static long chocolates(int N) {

        long total = 0;

        for(int i = 1; i <= N; i++) {

            total += i;

            int left = (i == 1) ? N : i - 1;
            int right = (i == N) ? 1 : i + 1;

            if(left % 5 == 0 || right % 5 == 0)
                total += 2;
        }

        return total % MOD;
    }
}