package chapter_8;

public class CircularQueue implements ICharQ {

    private char q[];
    private int putLoc, getLoc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    public void put(char ch) {
        if ((putLoc + 1 == getLoc) || ((putLoc == q.length - 1) && (getLoc == 0))) {
            System.out.println(" - Queue is full");
            return;
        } else {
            q[putLoc++] = ch;
            if (putLoc == q.length) {
                putLoc = 0;
            }
        }
    }



    public char get(){
        if (getLoc == putLoc){
            System.out.println(" - Queue is empty");
            return (char) 0;
        } else {
            char ch = q[getLoc++];
            if (getLoc == q.length){
                getLoc = 0;
            }
            return ch;
        }
    }

}


