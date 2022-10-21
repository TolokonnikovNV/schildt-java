package chapter_3;


import java.io.IOException;

public class Guess3 {
    public static void main(String[] args) throws IOException {

        char answer = 'K';
        System.out.println("задумана буква из диапазона A-Z");
        System.out.println("Попытайтесь ее угадать");
        char ch = (char) System.in.read();
        if (ch == answer) System.out.println("***Правильно!***");
        else{
            System.out.print("...Извините, нужная буква находится ");
            if (ch < answer){
                System.out.println("ближе к концу алфавита");
            } else {
                System.out.println("ближе к началу алфавита");

            }
        }
    }
}