package chapter_5;

public class NoZeroDiv2 {
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++) {

            if(i != 0 ? true : false){
                System.out.println("100 / " + i + " equals " + 100 / i);
            }
        }
    }
}
