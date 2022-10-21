package chapter_9;

public interface ICharQ {
    void put(char ch) throws QueueFullException;
    char get() throws QueueEmptyException;
}
