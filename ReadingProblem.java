import java.util.*;

public class ReadingProblem {
    public static int maxBooks(int[] books, int N, int size) {

        Arrays.sort(books);

        int count = 0;
        int time = 0;

        for(int i = 0; i < size; i++) {

            if(time + books[i] <= N) {
                time += books[i];
                count++;
            }
            else
                break;
        }

        return count;
    }
}
