import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(b.readLine());
        long eS = (n * (n + 1)) / 2;
        long aS = Arrays.stream(b.readLine().split(" ")).mapToLong(Long::parseLong).sum();
        System.out.println(eS - aS);
    }
}
