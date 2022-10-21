package chapter_8;

public class DynQueue implements ICharQ{
    private char q[];
    private int putLoc, getLoc;

    public DynQueue(int size){
        q = new char[size];
        putLoc = getLoc =0;
    }

    @Override
    public void put(char ch) {
        if(putLoc == q.length){
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        q[putLoc++] = ch;
    }

    @Override
    public char get() {
        if (getLoc == putLoc){
            System.out.println(" - Queue is empty");
            return  (char) 0;
        } else {
            return q[getLoc++];
        }
    }
}
