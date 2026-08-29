import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int count = String.valueOf(n).length();
        // int count = 0;
        // if (n == 0) {
        //     count = 1;
        // }
        // while(n>0){
        //     count ++;
        //     n = n / 10;
        // }
        int sum = 0;
        while(temp >0){
            int last_digit = temp % 10;
            sum = sum + (int)(Math.pow(last_digit,count));
            temp = temp / 10;
        }
        if(original == sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
        sc.close();
    }
}
