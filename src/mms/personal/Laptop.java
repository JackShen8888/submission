package mms.personal;

public class Laptop  extends  Personal{//便携式电脑
    public int age;

    @Override
    public String toString() {
        return "Laptop{" +
                "age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Laptop(String owner, int age) {
        super(owner);
        if(age<0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
}