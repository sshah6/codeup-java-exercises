package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public int getlength() {
        return length;
    }

    @Override
    void setLength(int length) {
        this.length = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
    }


//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return 2 * (length + width);
//    }

}
