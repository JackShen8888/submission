package mms.furniture;

public enum FurnitureType {//家具
    //1.提供当前枚举类对象
    TELEVISION("电视",1.3,0.75,0.1),
    BED("床",1.5,2,0.5),
    TABLE("餐桌",3,5,1),
    CHAIR("椅子",0.5,1.5,0.5),
    DESK("办公桌",1.2,2,1);

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

    public double getWidth() {
        return width;
    }
    //3.构造器
    FurnitureType(String name, double width, double height, double length ) {
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
    }
}