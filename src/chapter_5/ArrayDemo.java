package chapter_5;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];

        for (int i = 0; i < 10; i++){
            sample[i] = i;
            System.out.println("Element sample[" + i + "] contain " + i);
        }
    }
}
