package Strings;

public class IsomorphicString {

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (m1[ch1] == 0 && m2[ch2] == 0) {
                m1[ch1] = ch2;
                m2[ch2] = ch1;
            } else if (m1[ch1] != ch2 || m2[ch2] != ch1) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
}
