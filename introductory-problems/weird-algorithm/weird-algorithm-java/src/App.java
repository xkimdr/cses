import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(b.readLine());

        StringBuilder sb = new StringBuilder();

        while (n != 1) {
            sb.append(n);
            sb.append(" ");
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }

        sb.append(n);

        System.out.println(sb.toString());
    }
}
