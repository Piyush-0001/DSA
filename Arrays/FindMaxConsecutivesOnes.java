package Arrays;

import java.util.Scanner;

public class FindMaxConsecutivesOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int a[] = new int[n];
         for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
         }
         int count = 0;
         int max = 0;
         for(int i=0; i<n; i++){
            if(a[i] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
         }
         System.out.println("the maximim consecutive ones are "+max);
         sc.close();
    }
}
