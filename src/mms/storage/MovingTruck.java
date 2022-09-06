package mms.storage;

import mms.utility.Size;

public class MovingTruck extends Storage {

    public Size size;

    @Override
    public String toString() {
        return "MovingTruck{" +
                "size=" + size +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", size=" + size +
                ", pageableList=" + pageableList +
                '}';
    }

    public MovingTruck(int width, int height, int length, Size size) {
        super(width, height, length);
        this.size = size;
    }

    public String toString(int i) {
        if(pageableList.size()==0){
            return null;
        }else {
            return pageableList.get(i).toString();
        }
    }
}