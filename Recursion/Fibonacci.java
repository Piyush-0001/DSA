package Recursion;

public class Fibonacci {
    // using recursive function
    static int fib(int n){
        if (n < 0) {
        throw new IllegalArgumentException("n cannot be negative");
        }
        if (n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        // Iterative/Dynamic Programming approach
        int n = 5;
        if(n==0){
            System.out.println(0);
        }else if(n==1){
            System.out.println("0 1");
        }else{
            int fibb[] = new int[n+1];
            fibb[0] = 0;
            fibb[1] = 1;
            for(int i=2; i<fibb.length; i++){
                fibb[i] = fibb[i-1] + fibb[i-2];
            }
            for(int i=0; i<fibb.length; i++){
                System.out.print(fibb[i] + " ");
            }
            System.out.println();
        }
        System.out.println("fibonacci of n is : " + fib(n));
    }
}
