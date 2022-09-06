package mms.personal;

import mms.utility.Packable;


public class Personal implements Packable {

    public String owner;
    public double width;
    public double height;
    public double length;
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Personal(String owner) {
        if(owner == null){
            throw new IllegalArgumentException("所属者不可为null!");
        }
        this.owner = owner;
    }
    public Personal(String owner, double width, double height,
                    double length){
        if(owner == null || width <0 || height<0 || length<0){
            throw new IllegalArgumentException("非法数据");
        }
        this.owner = owner;
        this.width = width;
        this.height = height;
        this.length = length;
    }


    protected void setDimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    @Override
    public double getVolume() {
        return width*height*length;
    }

    @Override
    public String toString() {
        return "Personal("+owner+")";
    }
    public static int getBaseWeight(){
        return 250;
    }
}