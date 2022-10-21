package chapter_8;
import chapter_8.bookpackext.ExtBook;
public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java for begginers", "Herbert Schildt", 2018, "ABC");
        books[1] = new ExtBook("Java complete reference", "Herbert Shildt", 2018, "ABC");
        books[2] = new ExtBook("The art of Java programming", "Herbert Schildt", 2005, "ABC");
        books[3] = new ExtBook("Red storm", "Tom Clancy", 2006, "ABC");
        books[4] = new ExtBook("To the road", "Jack Keryak", 2012, "ABC");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
        System.out.println("All books Herbert's Schildt's");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals("Herbert Schildt")) {
                System.out.println(books[i].getTitle());
            }
        }
    }
}
