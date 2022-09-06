package mms.storage;

import mms.exceptions.PackingOrderException;
import mms.exceptions.StorageFullException;
import mms.furniture.Furniture;
import mms.utility.Packable;
import mms.utility.Size;

public class MovingTruck extends Storage implements Packable {

    public Size size;

    @Override
    public String toString() {
        return "MovingTruck (" +getOccupiedCapacity() + "/" + getCapacity()*getMultiplier() +")";

    }

    @Override
    protected int getMultiplier() {
        return 4;
    }

    public MovingTruck(int width, int height, int length, Size size) {
        super(width, height, length,size);
        if(length < 1500){
            throw new IllegalArgumentException("不可装载");
        }
    }
    public MovingTruck(int width, int height, int length) {
        super(width, height, length);
        if(length < 1500){
            throw new IllegalArgumentException("不可装载");
        }
        this.size = Size.LARGE;
    }
    public String toString(int i) {
        if(pageableList.size()==0){
            return null;
        }else {
            return pageableList.get(i).toString();
        }
    }
    @Override
    public void pack(Packable packable){
        if(getOccupiedCapacity()>getCapacity()*getMultiplier()){
            throw new StorageFullException("MovingTruck超载！");
        }
        if((packable instanceof Furniture) && hasNotFurniture()){
            throw new PackingOrderException("MovingTruck非家具类物品不可和家具类物品一起装载！");
        }
        super.pack(packable);
    }
    @Override
    public double getVolume(){
        return width * height *  (length - 1500);
    }

    public boolean hasNotFurniture(){
        for(Packable item : pageableList){
            if(item instanceof Furniture){

            }else {
                return true;
            }
        }
        return false;
    }
}