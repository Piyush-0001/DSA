package Recursion;

import java.util.Scanner;

public class PrintNumber {

    static void printNumbers(int current, int n){
        if(current > n){
            return;
        }
        System.out.print(current + " ");
        printNumbers(current+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(1, n);
        sc.close();
        
    }
}
