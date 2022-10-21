package chapter_8;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println("User ID: " + obj.getUserID());
        System.out.println("Admin ID: " + obj.getAdminID());
    }
}
