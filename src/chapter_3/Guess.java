package chapter_3;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {

    char answer = 'K';
        System.out.println("задумана буква из диапазона A-Z");
        System.out.println("Попытайтесь ее угадать");
        char ch = (char) System.in.read();
        if (ch == answer) System.out.println("***Правильно!***");
    }
}
