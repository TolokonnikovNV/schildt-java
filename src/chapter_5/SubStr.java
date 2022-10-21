package chapter_5;

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java is engine of the internet";
        String substr = orgstr.substring(8, 15);
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
