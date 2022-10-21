package chapter_6;

public class CallByRef {
    public static void main(String[] args) {
        Test testRef = new Test(15, 20);
        System.out.println("testRef.a and testRef.b before call: "+ testRef.a + " " + testRef.b);
        testRef.change(testRef);
        System.out.println("testRef.a and testRef.b after call: "+ testRef.a + " " + testRef.b);


    }
}
