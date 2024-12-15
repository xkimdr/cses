import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        final long n = Long.parseLong(buff.readLine());

        final long sum1 = (n * (n + 1)) / 2;

        StringTokenizer st = new StringTokenizer(buff.readLine());

        long sum2 = 0;

        while (st.hasMoreTokens()) {
            sum2 += Long.parseLong(st.nextToken());
        }

        System.out.println(sum1 - sum2);
    }
}
