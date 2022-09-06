package mms.storage;


import mms.utility.Size;

public class Box extends Storage {

    public String msg;

    @Override
    public String toString() {
        return "Box{" +
                "msg='" + msg + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", pageableList=" + pageableList +
                '}';
    }

    public Box(int width, int height, int length, String msg) {
        super(width, height, length);
        this.msg =msg;
    }
    public Box(int width, int height, int length, Size size, String msg) {
        super(width, height, length,size);
        this.msg =msg;
    }
    public Box(int width, int height, int length) {
        super(width, height, length);
    }
}