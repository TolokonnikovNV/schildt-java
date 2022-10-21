package chapter_3;

public class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("задумана буква из диапазона A-Z.");
            System.out.println("Попытайтесь ее угадать: ");

            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();

            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("Правильно");
            } else {
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer) {
                    System.out.println("ближе к концу алфавита");
                } else {
                    System.out.println("ближе к началу алфавита");
                }
            }
        } while (ch != answer);
    }
}
