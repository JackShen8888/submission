package mms.personal;


import mms.utility.Packable;

public class Book extends Personal implements Packable {
    public String title;
    public boolean isFiction;

    @Override
    public String toString() {
        return "Book (" + owner + ") Title: " + title + "("+(isFiction?"Fiction":"Non-Fiction")+")";
    }
    public String getTitle() {
        return title;
    }
    public Book(String owner, String title, boolean isFiction) {
        super(owner);
        if(title == null){
           throw new IllegalArgumentException("title is null!");
        }
        this.title = title;
        this.isFiction = isFiction;
    }

    @Override
    public double getVolume() {
        return width*height*length;
    }
}