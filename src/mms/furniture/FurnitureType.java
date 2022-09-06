package mms.furniture;

public enum FurnitureType {//家具
    //1.提供当前枚举类对象
    TELEVISION("电视",0.75,0.5,1),
    BED("床",2.0,0.6,1),
    TABLE("餐桌",5.0,0.7,1),
    CHAIR("椅子",1.5,0.8,1),
    DESK("办公桌",2.0,0.9,1);

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    //2.声明属性并以private final修饰
    public final String name;
    public final double height;
    public final double length;
    public final double width;

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
    //3.构造器
    FurnitureType(String name, double height, double length, double width) {
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
    }
}