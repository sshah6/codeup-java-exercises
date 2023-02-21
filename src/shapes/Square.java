package shapes;

//Inherits the constructor from the Parent(Rectangle)
//and overrides with the side
public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
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


//    private int side;
//
//    public Square(int side) {
//        //super inhrited from Rectangle but overridden
//        super(side, side);
//        this.side = side;
//    }

    //the method is inherited from rectangle but also overridden, it works even without them
//    @Override
//    public int getArea() {
//        return side * side;
//    }
//
//    //the method is inherited from rectangle but also overridden, it works even without them
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }
}
