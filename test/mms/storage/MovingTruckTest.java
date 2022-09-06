package mms.storage;

import mms.personal.Book;
import mms.utility.Size;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovingTruckTest {
    private MovingTruck movingTruck1;
    private MovingTruck movingTruck2;
    private MovingTruck movingTruck3;

    @Before
    public void setUp() {
       movingTruck1 = new MovingTruck(2000, 2500, 4000, Size.LARGE);
       movingTruck2 = new MovingTruck(1500, 2500, 4000, Size.MEDIUM);
       movingTruck3 = new MovingTruck(1000, 2500, 4000, Size.SMALL);
    }
    @Deprecated
    @Test
    public void test() {
        try {
            MovingTruck movingTruck = new MovingTruck(1000, 1500, 1400, Size.SMALL);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        String message = "The string returned from toString() does not match " +
                "what is expected: ";
        assertEquals(message, "MovingTruck (0/40)",
                movingTruck1.toString());
        assertEquals(message, "MovingTruck (0/20)",
                movingTruck2.toString());
        assertEquals(message, "MovingTruck (0/12)",
                movingTruck3.toString());
        movingTruck1.pack(new Box(200,200,200));
        assertEquals(message, "MovingTruck (1/40)",
                movingTruck1.toString());
        movingTruck1.unpack();
        assertEquals(message, "MovingTruck (0/40)",
                movingTruck1.toString());
    }
}