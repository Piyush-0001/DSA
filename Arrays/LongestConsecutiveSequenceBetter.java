package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequenceBetter {

    static int longestConsecutiveSequence(int a[]) {
        int n = a.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(a);
        int longest = 1;
        int lastSmallest = a[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] - 1 == lastSmallest) {
                count += 1;
                lastSmallest = a[i];
            } else if (a[i] != lastSmallest) {
                count = 1;
                lastSmallest = a[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("the longest sequence is " + longestConsecutiveSequence(a));
        sc.close();

    }
}
