package Strings;

public class LargestOddNum {

    static String largestOdd(String s){
        int index = -1;
        int i;
        for(i=s.length()-1; i>=0; i--){
            if((s.charAt(i) - '0')% 2 == 1){
                index = i;
                break;
            }
        }
        if(index == -1){
            return "";
        }
        i = 0;
        while (i <= index && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i,index+1);
    }
    public static void main(String[] args) {
        String s = "0354270";
        System.out.println(largestOdd(s));
    }
}
