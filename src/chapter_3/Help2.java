package chapter_3;

import java.io.IOException;

public class Help2 {
    public static void main(String[] args) throws IOException {
        char choice;
        char ignore;

        do {

            System.out.println("Справка:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println(" 6. exit");
            System.out.println("Веберите:");

            choice = (char) System.in.read();
            System.out.println();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            switch (choice) {
                case '1' -> {
                    System.out.println("Инструкция if:");
                    System.out.println("if(условие)инструкция");
                    System.out.println("else инструкция");
                    System.out.println();
                    break;
                }
                case '2' -> {
                    System.out.println("Инструкция switch: \n");
                    System.out.println("switch (выражение) {");
                    System.out.println(" case константа:");
                    System.out.println(" последовательность инструкций");
                    System.out.println(" break");
                    System.out.println(" //...");
                    System.out.println("}");
                    System.out.println();
                    break;
                }
                case '3' -> {
                    System.out.println("Цикл for: ");
                    System.out.println("for(Инициализация; Условие; Итерация){");
                    System.out.println("    Инструкции;");
                    System.out.println("}");
                    System.out.println();
                    break;
                }
                case '4' -> {
                    System.out.println("Цикл while:");
                    System.out.println("while(условие){");
                    System.out.println("    Инструкции;");
                    System.out.println("}");
                    System.out.println();
                    break;
                }
                case '5' -> {
                    System.out.println("Цикл do-while:");
                    System.out.println("do {");
                    System.out.println("    Инструкции;");
                    System.out.println("} while (Условие)");
                    System.out.println();
                    break;
                }
            }

        } while (choice != '6');


    }
}
