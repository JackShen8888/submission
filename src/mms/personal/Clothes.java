package mms.personal;

import mms.utility.Size;

public class Clothes extends Personal {
    public ClotheType clotheType;
    public Size size;

    @Override
    public String toString() {
        return "Clothes (" + owner + ") (" +size+", "+clotheType+")";

    }

    public Clothes(String owner, Size size, ClotheType clotheType){
        super(owner);
        this.size = size;
        this.clotheType = clotheType;
    }
}
