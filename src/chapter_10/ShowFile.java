package chapter_10;
import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if(args.length != 1){
            System.out.println("Using: ShowFile file_name");
            return;
        }


        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            return;
        }


        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e){
            System.out.println("Read file error");
        }


        try {
            if (fin != null) {
                fin.close();
            }
        } catch (IOException e){
            System.out.println("Close file error");
        }



    }
}
