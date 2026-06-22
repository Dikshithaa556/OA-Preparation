public class PenSwitching {

    public static int countSwitches(int N, int[] arr) {

        int count = 0;

        for(int i = 1; i < N; i++) {

            if(arr[i-1] % 2 != 0 &&
               arr[i] % 2 == 0)
                count++;
        }

        return count;
    }
}
