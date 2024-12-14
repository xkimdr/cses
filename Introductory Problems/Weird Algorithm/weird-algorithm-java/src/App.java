import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        final long n = Long.valueOf(scan.nextLine());

        weirdAlgorithm(n);

        scan.close();
    }

    private static void weirdAlgorithm(long n) {
        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.println(n);
    }
}
