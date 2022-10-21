package chapter_6;

public class FailSortArray {
    private int a[];
    private int errVal;
    public int length;

    public FailSortArray(int size, int errVal) {
        this.a = new int[size];
        this.errVal = errVal;
        this.length = size;
    }

    public int get(int index) {
        if (indexOK(index)) {
            return a[index];
        } else {
            return errVal;
        }
    }

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        } else {
            return false;
        }
    }

    private boolean indexOK(int index) {
        if (index >= 0 && index < length) {
            return true;
        } else {
            return false;
        }
    }
}
