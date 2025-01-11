import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        buff.readLine();

        String[] vals = buff.readLine().split(" ");

        long x = 0;
        long c = 0;

        for (String s : vals) {
            long y = Long.parseLong(s);

            if (x > y) {
                c += x - y;
            } else {
                x = y;
            }
        }

        System.out.println(c);
    }
}
