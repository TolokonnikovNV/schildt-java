package chapter_6;

public class Test {

    int a,b;
    String str;

    public Test(String str) {
        this.str = str;
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test() {
    }

    void noChanges(int i, int j){
        i = i + j;
        j = -j;
    }

    void change(Test test){
        test.a = test.a + test.b;
        test.b = -test.b;
    }

   public static void changeString(String str){
        str = "changed!";
    }


}
