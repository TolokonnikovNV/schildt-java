package chapter_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;
        System.out.print("How many numbers need to input?: ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("Wrong format");
            n = 0;
        }

        System.out.println("Input " + n + " meaning");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException e){
                System.out.println("Wrong format");
                t = 0.0;
            }

            sum += t;
        }
        avg = sum / n;
        System.out.println("AVG: " + avg);
    }
}
