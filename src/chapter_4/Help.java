package chapter_4;

public class Help {
    void helpOn(char what) {
        switch (what) {
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
            case '6' -> {
                System.out.println("Инструкция break;");
                System.out.println("break; или break label;");
                break;
            }
            case '7' -> {
                System.out.println("Инструкция continue:");
                System.out.println("continue; или continue label");
            }
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue");
        System.out.println("Веберите (q - exit):");
    }

    boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') {
            return false;
        } else {
            return true;
        }
    }
}
