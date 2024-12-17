import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String string = buff.readLine();
        char pc = 'X';
        long n = 1;
        long m = 1;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == pc) {
                ++n;
            } else {
                pc = c;
                if (n > m) {
                    m = n;
                }
                n = 1;
            }
        }

        if (n > m) {
            m = n;
        }

        System.out.println(m);
    }
}
