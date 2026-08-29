package Recursion;

public class demo {
    public static void main(String[] args) {
        //  \u000d //System.out.println("hello");

        String s = "Java is easy";

        String words[] = s.split(" ");

        for(String word : words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }

            System.out.print(" ");
        }
    
    }
}
