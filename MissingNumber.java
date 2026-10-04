import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n - 1; i++) {
            sum += sc.nextInt();
        }

        long expected = (long) n * (n + 1) / 2;

        System.out.println(expected - sum);

        sc.close();
    }
}