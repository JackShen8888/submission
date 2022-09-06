package mms.personal;

import mms.utility.Packable;

public class Laptop  extends  Personal implements Packable {//便携式电脑
    public int age;

    @Override
    public String toString() {
        return  "Laptop ("+owner+") - "+age;
    }

    public Laptop(String owner, int age) {
        super(owner);
        if(age<0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
    @Override
    public double getVolume() {
        return width*height*length;
    }
}