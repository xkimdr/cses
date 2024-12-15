import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        final long n = Long.valueOf(scan.nextLine());

        String s = scan.nextLine();

        scan.close();

        final long sum1 = (n * (n + 1)) / 2;

        long sum2 = 0;
        for (String str : s.split(" ")) {
            sum2 += Long.valueOf(str);
        }

        System.out.println(sum1 - sum2);
    }
}
