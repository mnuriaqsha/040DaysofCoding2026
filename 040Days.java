import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int H = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();

        int totalMenit = H * 60 + M + K;

        int D = totalMenit / (24 * 60);

        int jam = (totalMenit / 60) % 24;
        int menit = totalMenit % 60;

        System.out.printf("%02d:%02d %d%n", jam, menit, D);

        input.close();
    }
}
