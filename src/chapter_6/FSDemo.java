package chapter_6;

public class FSDemo {
    public static void main(String[] args) {
        FailSortArray fs = new FailSortArray(5, -1);
        int x;

        System.out.println("Error handing without reporting");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Error handing with reporting");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.println("Index " + i + " out of range");
            }
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.println("Index " + i + " out of range");
            }
        }


    }
}
