public class PasswordDistance {
    public static int maxDistance(String s) {
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != s.charAt(n - 1))
                return n - 1;
        }

        return 0;
    }
}
