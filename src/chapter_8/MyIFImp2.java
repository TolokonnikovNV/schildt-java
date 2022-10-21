package chapter_8;

public class MyIFImp2 implements MyIF{
    @Override
    public int getUserID() {
        return 100;
    }

    @Override
    public int getAdminID() {
        return 42;
    }
}
