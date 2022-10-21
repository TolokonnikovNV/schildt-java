package chapter_5;

public class Queue {
    char q[];
    int putLoc, getLoc;

    public Queue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
    }

    void put(char ch){
        if (putLoc == q.length){
            System.out.println("Queue is full");
            return;
        }

        q[putLoc++] = ch;
    }

    char get(){
        if (getLoc == putLoc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }

        return q[getLoc++];
    }


}
