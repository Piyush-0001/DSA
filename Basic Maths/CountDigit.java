import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        while(n > 0){
            count ++;
            n = n / 10;
        }
        System.out.println("the number of digit in " + original + " is " + count);
        sc.close();
    }
}
