package mms.storage;


import mms.personal.Laptop;
import mms.utility.Packable;
import mms.utility.Size;

public class Box extends Storage implements Packable {

    public String comment;

    @Override
    public String toString() {
        return "Box(" + width + ", " + height +", " + length + ")" + size + "-"+comment;
    }

    @Override
    protected int getMultiplier() {
        return 2;
    }

    public Box(int width, int height, int length, String comment) {
        super(width, height, length,Size.MEDIUM);
        this.comment =comment;
    }
    public Box(int width, int height, int length, Size size, String comment) {
        super(width, height, length,size);
        this.comment =comment;
    }
    public Box(int width, int height, int length) {
        super(width, height, length);
    }

    public String getComment(){
        return comment;
    }
    public boolean isFragile(){
        for(Packable packable :pageableList){
            if(packable instanceof Laptop){
                return true;
            }
        }
        return false;
    }
}