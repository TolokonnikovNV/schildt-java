package chapter_5;

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "line", "is", "text"};
        System.out.println("Source array: ");
        for(String s : strs){
            System.out.print(s + " ");
        }
        System.out.println();
        strs[2] = "is also";
        strs[3] = "text";

        System.out.println("Changed array: ");
        for (String s: strs){
            System.out.print(s + " ");
        }
    }
}
