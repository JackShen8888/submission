package mms.personal;

import mms.utility.Packable;
import mms.utility.Size;

public class Clothes extends Personal implements Packable {
    public ClotheType clotheType;
    public Size size;

    public ClotheType getClotheType() {
        return clotheType;
    }

    public Size getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "Clothes (" + owner + ") (" +size+", "+clotheType+")";

    }

    public Clothes(String owner, Size size, ClotheType clotheType){
        super(owner);
        this.size = size;
        this.clotheType = clotheType;
    }
    @Override
    public double getVolume() {
        return width*height*length;
    }
}
