import java.util.*;

public class LibraryBookSorting {

    public static int minimumMoves(int N, String s) {

        char[] original = s.toCharArray();

        char[] sorted = s.toCharArray();

        Arrays.sort(sorted);

        int count = 0;

        for(int i = 0; i < N; i++) {

            if(original[i] != sorted[i])
                count++;
        }

        return count;
    }
}
