package chapter_9;

public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            for(i = 0; i < 11; i++){
                System.out.print("Trying to save: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException e){
            System.out.println(e);
        }

        System.out.println();

        try {
            for (i = 0; i < 11; i++){
                System.out.print("Getting another symbol: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException e){
            System.out.println(e);
        }
    }
}
