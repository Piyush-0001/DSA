package BinarySearch;

import java.util.Arrays;

//Lower Bound → first index where arr[index] >= target
public class LowerBound {
    static int searchLowerBoundIndex(int[] arr, int target, int n){
        int low = 0;
        int high = n-1;
        int ans = n; // handles the case where no element is ≥ target
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 2};
        Arrays.sort(a);
        int result = searchLowerBoundIndex(a, 1, a.length);
        System.out.println(result);
    }
}
