package Recursion;

import java.util.Scanner;

// print N to 1 using recursion
public class PrintNumber1 {

    static void printNumber(int n){
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        printNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
        sc.close();

    }
}
