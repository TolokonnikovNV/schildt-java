package chapter_6;

public class QDemo2 {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);

        char name[] = {'T', 'O', 'M'};
        Queue q2 = new Queue(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        Queue q3 = new Queue(q1);

        System.out.print("q1 content: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println();


        System.out.print("q2 content: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println();


        System.out.print("q3 content: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}
