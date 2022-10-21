package chapter_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String helpFile;

    Help(String fName) {
        helpFile = fName;
    }

    boolean helpon(String what) {
        int ch;
        String topic, info;
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpFile))) {
            do {
                ch = helpRdr.read();

                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if (info != null) {
                                System.out.println(info);
                            }
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);

        } catch (IOException e) {
            System.out.println("Error when trying to access help file");
            return false;
        }
        return false;
    }

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Choice topic: ");
        try {
            topic = br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading from console");
        }
        return topic;
    }
}
