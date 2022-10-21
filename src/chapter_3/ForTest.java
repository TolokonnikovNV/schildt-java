package chapter_3;

public class ForTest {
    public static void main(String[] args) throws java.io.IOException{
        int i;
        System.out.println("Для остановки нажмите клавишу S");
        char temp;

        for (i = 0;(temp = (char) System.in.read()) != 'S'; i++) {
            System.out.println("Проход # " + i);
            //System.in.read();
        }
    }
}
