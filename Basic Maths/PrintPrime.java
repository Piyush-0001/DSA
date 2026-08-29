import java.util.Scanner;

public class PrintPrime {

    static boolean prime(int n){
        if(n <= 1){
                return false;
        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if (n % i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i<=n; i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
