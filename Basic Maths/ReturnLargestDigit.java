import java.util.Scanner;

public class ReturnLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = 0;
        while(n > 0){
            int last_digit = n % 10;
            if(last_digit > largest){
                largest = last_digit;
            }
            n = n / 10;
        }
        System.out.println("the largest digit is "+largest);
        sc.close();
    }
}
