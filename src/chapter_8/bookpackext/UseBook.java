package chapter_8.bookpackext;
import chapter_8.bookpack.Book;
class UseBook {
    public static void main(String[] args) {
        Book books[] = new  Book[5];

        books[0] = new Book("Java for begginers", "Herbert Schildt", 2018);
        books[1] = new Book("Java complete reference", "Herbert Shildt", 2018);
        books[2] = new Book("The art of Java programming", "Herbert Schildt", 2005);
        books[3] = new Book("Red storm", "Tom Clancy", 2006);
        books[4] = new Book("To the road", "Jack Keryak", 2012);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }


    }
}