package mms.furniture;

import mms.utility.Packable;

public class Furniture implements Packable {
    public FurnitureType furnitureType;

    @Override
    public String toString() {
        return "Furniture ("+furnitureType.name() +")";
    }

    public Furniture(FurnitureType furnitureType){
        this.furnitureType = furnitureType;
    }

    public FurnitureType getType() {
        return this.furnitureType;
    }

    public double getLength() {
        return this.furnitureType.length * 100;
    }
    @Override
    public double getWidth() {
        return this.furnitureType.width;
    }

    @Override
    public double getHeight() {
        return this.furnitureType.height;
    }
    @Override
    public double getVolume() {
        return getWidth()*getHeight()*getLength();
    }
}