package chapter_8;

public class ByTwos implements Series{
    int start;
    int val;


    ByTwos(){
        start = 0;
        val = 0;

    }

    public int getNext(){
        val = val + 2;
        return val;
    }

    public void reset(){
        start = 0;
        val = 0;
    }

    public void setStart(int x){
        start = x;
        val = x;

    }

}
