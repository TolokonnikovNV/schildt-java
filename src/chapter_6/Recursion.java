package chapter_6;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Recursive calculation: ");
        System.out.println("Factorial 3 is " + f.factR(3));
        System.out.println("Factorial 4 is " + f.factR(4));
        System.out.println("Factorial 5 is " + f.factR(5));
        System.out.println();
        System.out.println("Calculation by interactive method");
        System.out.println("Factorial 3 is " + f.factI(3));
        System.out.println("Factorial 4 is " + f.factI(4));
        System.out.println("Factorial 5 is " + f.factI(5));
    }
}
