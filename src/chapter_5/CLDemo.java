package chapter_5;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("The program as given " + args.length + " arguments of command line");
        System.out.println("List of arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }
}
