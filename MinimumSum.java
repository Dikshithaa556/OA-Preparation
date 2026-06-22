import java.util.*;

public class MinimumSum{
    public static int minimumSum(int n, int[] A, int[]B){
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=A[i]*B[n-1-i];
        }
        return sum;
    }
}