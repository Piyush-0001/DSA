package Strings;

public class RemoveOuterParentheses {

    static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int level = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // if its on 0 level don't add that one
                if (level > 0) {
                    res.append(ch);
                }
                level++;
            } else {
                level--;
                if (level > 0) {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "(()()())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);

    }
}
