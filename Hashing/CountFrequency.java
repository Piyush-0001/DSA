package Hashing;

import java.util.Scanner;

class CountFrequency {

    static void countfreq(int n, int a[]){
        boolean b[]= new boolean[n];
        for(int i=0; i<n; i++){
            if(b[i]){
                continue;
            }
            int count=1;
            for(int j=i+1; j<n; j++){
                if(a[i]==a[j]){
                    b[j]=true;
                    count++;
                }
            }
            System.out.println(a[i] + " " + count);
        }
    }

    static void countfreq1(int n, int a[]){
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=0; j<i; j++){
                if(a[i] == a[j]){
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            int count =1;
            for(int j=i+1; j<n; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            System.out.println(a[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        countfreq(n, arr);
        countfreq1(n, arr);
        sc.close();

    }
}