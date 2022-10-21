package chapter_9;

public class QueueFullException extends Exception{
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    public String toString(){
        return " - Queue is full. Max size is " + size;
    }
}
