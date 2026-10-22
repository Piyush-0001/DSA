package Strings;

import java.util.Arrays;

public class AnagramBrute {
    static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

    }
    public static void main(String[] args) {
        String s = "cat";
        String t = "act";
        System.out.println(checkAnagram(s, t));
    }
}
