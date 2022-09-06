package mms.personal;


public class Book extends Personal{
    public String bookName;
    public boolean isCloth;

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isCloth=" + isCloth +
                ", owner='" + owner + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    public Book(String owner, String bookName, boolean isCloth) {
        super(owner);
        this.bookName = bookName;
        this.isCloth = isCloth;
    }
}