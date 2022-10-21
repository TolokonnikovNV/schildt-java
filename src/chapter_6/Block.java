package chapter_6;

public class Block {
    int a, b, c;
    int volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if ((ob.a == this.a) & (ob.b == this.b) & (ob.c == this.c)) {
            return true;
        } else {
            return false;
        }
    }

    boolean sameVolumeBlock(Block ob) {
        if (ob.volume == this.volume) {
            return true;
        } else {
            return false;
        }
    }

}
