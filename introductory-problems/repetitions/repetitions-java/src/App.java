import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s = b.readLine();

        char p = 'X';
        long c = 1;
        long m = 1;

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == p) {
                ++c;
            } else {
                m = Math.max(c, m);
                p = ch;
                c = 1;
            }
        }

        m = Math.max(c, m);

        System.out.println(m);
    }
}
