import java.util.Scanner;

public class CountDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThe positive count of divisors of the number is " + count);
        sc.close();
    }
}
