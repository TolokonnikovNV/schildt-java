package chapter_10;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;
        if (args.length != 2) {
            System.out.println("Using: CompFiles file1 file2");
        }

        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1]);) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) {
                    break;
                }
            } while (i != -1 && j != -1);

            if (i != j) {

                System.out.println("the contents of the files are different");
            } else {
                System.out.println("the contents of the files match");
            }


        } catch (IOException e){
            System.out.println("Input/Output error" + e);
        }
    }
}
