package mms.storage;


import mms.utility.Size;

public class Bag extends Storage{
    @Override
    public String toString() {
        return "Bag{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", size=" + size +
                ", pageableList=" + pageableList +
                '}';
    }

    public Bag(int width, int height, int length) {
        super(width, height, length);
    }

    public Bag(int width, int height, int length, Size size) {

        super(width, height, length, size);
    }
}