import java.util.Scanner;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=n;j<i+1;j++){
                System.out.print("* ");
            }
        }
        System.out.println();
        sc.close();
    }
}
