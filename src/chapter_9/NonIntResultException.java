package chapter_9;

public class NonIntResultException extends Exception{
    int n;
    int d;

    public NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString(){
        return "the result of operation " + n + " / " + d + " is not an integer";
    }
}
