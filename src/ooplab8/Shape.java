package ooplab8;
//Abstract class

public abstract class Shape {                            //Shape=รูปทรง เลขาคณิต
    private int width;  //ด้านกว้าง
    private int length; //ด้านยาว

    public abstract double getArea();


    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}//Shape
