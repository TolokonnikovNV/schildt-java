package chapter_8;

public class FixedQueue implements ICharQ{
    private char q[];
    private int putLoc, getLoc;

    public FixedQueue(int size){
        q = new char[size];
        putLoc = getLoc = 0;
    }

    public void put(char ch) {
        if (putLoc == q.length){
            System.out.println(" - Queue is full");
            return;
        } else {
            q[putLoc++] = ch;
        }
    }

    public char get() {
        if (getLoc == putLoc){
            System.out.println(" - Queue is empty");
            return  (char) 0;
        }

        return q[getLoc++];
    }
}
