package chapter_5;

public class AverageDouble {
    public static void main(String[] args) {
        double array[] = {
                1.0, 10.5, 123.4, 999.0 , -12.0, 0
        };

        double sum = 0;
        double average;

        for (double a: array){
            sum +=a;
        }
        System.out.println("Average: " + sum / array.length);

    }
}
