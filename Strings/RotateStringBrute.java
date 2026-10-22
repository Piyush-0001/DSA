package Strings;

public class RotateStringBrute {

    static boolean rotateString(String s, String target){
        if(s.length() != target.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            String rotate = s.substring(i) + s.substring(0, i);
            if(rotate.equals(target)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "rotation";
        String target = "tionrota";
        System.out.println(rotateString(s, target));
    }
}
