package chapter_6;

public class Backwards {
    String str;

    public Backwards(String str) {
        this.str = str;
    }

    void reverse(int idx){
        if (idx != str.length()-1){
            reverse(idx+1);
        }
        System.out.print(str.charAt(idx));
    }
}
