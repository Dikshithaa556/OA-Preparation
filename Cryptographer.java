public class Cryptographer {

    public static String decrypt(String s) {

        StringBuilder ans = new StringBuilder();

        for(char ch : s.toCharArray()) {

            if(ch == 'a')
                ans.append('z');
            else
                ans.append((char)(ch - 1));
        }

        return ans.toString();
    }
}