import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(buff.readLine());

        StringBuilder s = new StringBuilder();

        while (n != 1) {
            s.append(n);
            s.append(" ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        s.append(n);

        System.out.println(s.toString());

    }
}
