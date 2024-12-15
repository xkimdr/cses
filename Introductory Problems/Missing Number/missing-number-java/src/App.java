import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        final long n = Long.parseLong(buff.readLine());

        final long sum1 = (n * (n + 1)) / 2;

        long sum2 = 0;

        final String[] strings = buff.readLine().split(" ");

        for (String string : strings) {
            sum2 += Long.parseLong(string);
        }

        System.out.println(sum1 - sum2);
    }
}
