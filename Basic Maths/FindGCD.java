import java.util.Scanner;

public class FindGCD {

    static int cal_gcd(int a, int b){
        int gcd = 1;
        for(int i=1; i<=Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = cal_gcd(x, y);
        System.out.println(res);
        sc.close();

    }
}
