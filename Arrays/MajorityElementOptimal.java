package Arrays;

import java.util.Scanner;

public class MajorityElementOptimal {
    static int majorityElement(int a[]){
        int element = 0;
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(count == 0){
                element = a[i];
                count++;
            }
            else if(a[i] == element){
                count++;
            }else{
                count--;
            }
        }
        int cnt = 0;
        for(int i=0; i<a.length; i++){
            if(element == a[i]){
                cnt++;
            }
        }
        if(cnt > (a.length/2)){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(majorityElement(a));
        sc.close();
    }
}
