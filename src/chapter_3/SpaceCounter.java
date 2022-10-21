package chapter_3;

import java.io.IOException;

public class SpaceCounter {
    public static void main(String[] args) throws IOException {
        char ch;
        int counter = 0;
        do {
            ch = (char) System.in.read();
            if (ch == ' '){
                counter++;
            }
        }while(ch != '.');
        System.out.println(counter);
    }
}
