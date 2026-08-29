package Recursion;

import java.util.Scanner;

public class PrintName {
    static void printName(int n, int count, String name){
        if(count == n){
            return;
        }
        System.out.println(name);
        printName(n, count+1,name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        printName(n, 0, name);
        sc.close();

    }
}
