import java.util.Scanner;

public class CountPrime {

    static int countPrime(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(i + " ");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\nthe count of prime number between 1 to n is " + countPrime(n));
        sc.close();
    }
}
