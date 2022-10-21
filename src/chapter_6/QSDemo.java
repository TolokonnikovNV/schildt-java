package chapter_6;

public class QSDemo {
    public static void main(String[] args) {
        char a[] = {'q', 'd', 'a', 'b', 'c', 'e'};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        Quicksort.qsort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
