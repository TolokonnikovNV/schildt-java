package chapter_5;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "In Java String it is object";
        String str2 = new String("They can be created in different ways");
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
