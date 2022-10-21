package chapter_3;

public class KbIn {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;

        System.out.println("Press any key and press ENTER");
        ch = (char) System.in.read();
        System.out.println("Your input " + ch);
    }
}

