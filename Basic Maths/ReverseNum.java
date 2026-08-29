
public class ReverseNum {
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
        int result = reverse(7789);
        System.out.println(result);
    }
}
