package Recursion;

import java.util.Scanner;

public class PrintSum {
    static void printsum(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        printsum(n-1, sum + n);
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printsum(n,0);
        System.out.println(sum(n));
        sc.close();
    }
}
