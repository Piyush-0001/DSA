import java.util.Scanner;

public class CheckPalindrome {

    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int last_dig = n % 10;
            rev = rev * 10 + last_dig;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = reverse(n);
        if(n == res){
            System.out.println("its a plaindrome");
        }else{
            System.out.println("its not a palindrome");
        }
        sc.close();
    }
}
