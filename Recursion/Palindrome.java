package Recursion;

public class Palindrome {

    static String reverseString(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }

    // Two-pointer approach
    static boolean isPalindromeTwoPointer(String s){
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Recursive approach
    static boolean isPalindromeRecursive(String s, int left, int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindromeRecursive(s, left+1, right-1);
    }
    public static void main(String[] args) {
        String s = "hello";
        String temp = reverseString(s);
        if(s.equalsIgnoreCase(temp)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        // calling Two-pointer approach
        System.out.println(isPalindromeTwoPointer(s));
        // calling recusive approach
        System.out.println(isPalindromeRecursive(s, 0, s.length()-1));
    }
}
