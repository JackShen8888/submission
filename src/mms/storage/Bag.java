package mms.storage;


import mms.exceptions.BadItemException;
import mms.exceptions.PackingOrderException;
import mms.furniture.Furniture;
import mms.personal.Personal;
import mms.utility.Packable;
import mms.utility.Size;

public class Bag extends Storage implements Packable {
    @Override
    protected int getMultiplier() {
        return 1;
    }

    public Bag(int width, int height, int length) {
        super(width, height, length);
    }

    public Bag(int width, int height, int length, Size size) {

        super(width, height, length, size);
    }

    @Override
    public double getVolume() {
        return width*height*length;
    }

    @Override
    public void pack(Packable packable){
        if(packable instanceof Personal){
            super.pack(packable);
            //todo >1.5kg StorageFullException
        }else {
            throw new BadItemException("不可装载非Personal！");
        }
    }
}