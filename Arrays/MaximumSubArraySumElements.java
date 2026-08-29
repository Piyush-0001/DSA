package Arrays;

public class MaximumSubArraySumElements {
    
    static void maximumSubArraySum(int a[]){
        int n = a.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;
        for(int i=0; i<n; i++){
            if(sum == 0){
                start = i;
            }
            sum = sum +a[i];
            if(sum > maxsum){
                maxsum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("maximum subarray sum is "+maxsum);
        for(int i=ansStart; i<=ansEnd; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maximumSubArraySum(a);
    }
}
