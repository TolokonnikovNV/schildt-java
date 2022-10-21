package chapter_3;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        char choice;
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Веберете:");


        choice = (char) System.in.read();


        switch (choice) {
            case '1' -> {
                System.out.println("Инструкция if: \n");
                System.out.println("if(условие)инструкция");
                System.out.println("else инструкция");
            }
            case '2' -> {
                System.out.println("Инструкция switch: \n");
                System.out.println("switch (выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность инструкций");
                System.out.println(" break");
                System.out.println(" //...");
                System.out.println("}");
            }
            default -> System.out.println("Запрос не найден");
        }

    }
}
