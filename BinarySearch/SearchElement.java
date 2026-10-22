package BinarySearch;

import java.util.Arrays;

public class SearchElement {

    static int searchElement(int[] a, int n, int target) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (target > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int recursiveSearch(int[] a, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;  // overflow case : int mid = low + (high - low) / 2;
        if (a[mid] == target) {
            return mid;
        } else if (target > a[mid]) {
            return recursiveSearch(a, mid+1, high, target);
        } else {
            return recursiveSearch(a, low, mid-1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 6, 5 };
        int target = 6;
        Arrays.sort(arr);
        int result = searchElement(arr, arr.length, target);
        int result1 = recursiveSearch(arr, 0, arr.length-1, target);
        System.out.println(result);
        System.out.println(result1);

    }
}
