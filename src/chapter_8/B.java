package chapter_8;

public interface B extends A{
    void meth3();
    default void meth4(){
        System.out.println("default method");
    }
}
