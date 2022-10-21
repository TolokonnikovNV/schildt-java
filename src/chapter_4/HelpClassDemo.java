package chapter_4;

import java.io.IOException;

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        char ignore;
        Help help = new Help();
        char choice;
        do {
            help.showMenu();
            do {
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();

                } while (ignore != '\n');
            } while (!help.isValid(choice));

            help.helpOn(choice);


        } while (choice != 'q');


    }
}