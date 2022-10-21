package chapter_8.bookpackext;

public class ExtBook extends chapter_8.bookpack.Book {
    private String publisher;

    public ExtBook(String title, String author, int pubDate, String publisher) {
        super(title, author, pubDate);
        this.publisher = publisher;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }


    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        super.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        super.author = author;
    }

    public int getPubDate(){
        return super.pubDate;
    }

    public void setPubDate(int pubDate){
        super.pubDate = pubDate;
    }


}
