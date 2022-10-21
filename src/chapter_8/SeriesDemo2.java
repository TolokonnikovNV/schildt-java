package chapter_8;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next value ByTwos: " + ob.getNext());
            ob = threeOb;
            System.out.println("Next value ByThrees: " + ob.getNext());

        }
    }
}
