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
        this.owner = owner;
    }
    public Personal(String owner, double width, double height,
                    double length){
        this.owner = owner;
        this.width = width;
        this.height = height;
        this.length = length;
    }


    public void setDimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

}