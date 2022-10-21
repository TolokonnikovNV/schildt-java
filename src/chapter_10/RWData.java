package chapter_10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.25;
        boolean b = true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testData"))) {
            System.out.println("Recorded: " + i);
            dataOut.writeInt(i);

            System.out.println("Recorded: " + d);
            dataOut.writeDouble(d);

            System.out.println("Recorded: " + b);
            dataOut.writeBoolean(b);

            System.out.println("Recorded: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);


        } catch (IOException e){
            System.out.println("Recorded error");
            return;
        }

        System.out.println();

        try(DataInputStream dataIn = new DataInputStream((new FileInputStream("testData")))){
            i = dataIn.readInt();
            System.out.println("Read: " + i);

            d = dataIn.readDouble();
            System.out.println("Read: " + d);

            b = dataIn.readBoolean();
            System.out.println("Read: " + b);

            d = dataIn.readDouble();
            System.out.println("Read: " + d);
        } catch (IOException e){
            System.out.println("Read error");
        }
    }
}
