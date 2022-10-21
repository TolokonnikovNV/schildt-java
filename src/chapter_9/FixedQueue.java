package chapter_9;


public class FixedQueue implements ICharQ {
    private char q[];
    private int putLoc, getLoc;

    public FixedQueue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if (putLoc == q.length) {
            throw new QueueFullException(q.length);

        }
        q[putLoc++] = ch;

    }

    public char get() throws QueueEmptyException{
        if (getLoc == putLoc) {
            throw new QueueEmptyException();
        }

        return q[getLoc++];
    }
}
