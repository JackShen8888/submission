package mms.personal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void setUp() {
        book1 = new Book("Homer","Odyssey",true);
        book2 = new Book("Caleb2","C#",false);
        book3 = new Book("Caleb3","C++", false);
        book4 = new Book("Caleb4","Java", false);
    }
    @Deprecated
    @Test
    public void test() {
        try {
             Book book = new Book(null,null,false);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        String message = "The string returned from toString() does not match " +
                "what is expected: ";
        assertEquals(message, "Book (Homer) Title: Odyssey(Fiction)",
                book1.toString());
        assertEquals(message, "Book (Caleb2) Title: C#(Non-Fiction)",
                book2.toString());
        assertEquals(message, "Book (Caleb3) Title: C++(Non-Fiction)",
                book3.toString());
        assertEquals(message, "Book (Caleb4) Title: Java(Non-Fiction)",
                book4.toString());

    }
}