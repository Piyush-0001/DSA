package Strings;

public class RotateStringOptimal {

    static boolean rotateString(String s, String target){
        if(s.length() != target.length()){
            return  false;
        }
        String doubledString = s + s;
        return doubledString.contains(target);
    }
    public static void main(String[] args) {
        String s = "rotation";
        String target = "tionrota";
        System.out.println(rotateString(s, target));
    }
}
