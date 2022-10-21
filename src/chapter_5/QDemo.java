package chapter_5;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;

        System.out.println("Using a queue bigQ to story the alphabet");
        for (int i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.print("Queue bigQ contents: ");
        for (int i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != ((char) 0)){
                System.out.print(ch);
            }
        }

        System.out.println();

        System.out.println("Using queue smallQ for generate errors");

        for (int i = 0; i < 5; i++) {
            System.out.println("Try to save " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));

        }

        System.out.println("Queue smallQ contents: ");
        for (int i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != ((char) 0)){
                System.out.print(ch);
            }
        }


    }
}
