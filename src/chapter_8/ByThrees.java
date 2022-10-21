package chapter_8;

public class ByThrees implements Series {
    int start;
    int val;

    void ggg(){
        System.out.println("ggg");
    }


    ByThrees() {
        start = 0;
        val = 0;

    }

    public int getNext() {
        val = val + 3;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;

    }


}
