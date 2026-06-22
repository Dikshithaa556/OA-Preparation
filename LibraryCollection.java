public class LibraryCollection {

    static boolean isPrime(int n) {

        if(n < 2)
            return false;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static int collectBooks(int N, int K, int[] A) {

        int total = 0;

        for(int i = 1; i <= N; i++) {

            if(isPrime(i)) {

                total += Math.min(A[i - 1], K);
            }
        }

        return total;
    }
}
