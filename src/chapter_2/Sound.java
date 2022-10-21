package chapter_2;

public class Sound {
    public static void main(String[] args) {
        double soundSpeed = 1100;
        double time = 7.2;
        double echoTime = time / 2;
        double distance =  soundSpeed * time;
        double echoDistance =  soundSpeed * echoTime;
        System.out.println("расстояние до места вспышки молнии составляет " + distance + " футов");
        System.out.println("расстояние до места отражения эха составляет " + echoDistance + " футов");
    }
}
