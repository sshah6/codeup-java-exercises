package shapes;

//Inherits the constructor from the Parent(Rectangle)
//and overrides with the side
public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        //super inhrited from Rectangle but overridden
        super(side, side);
        this.side = side;
    }

    //the method is inherited from rectangle but also overridden, it works even without them
    @Override
    public int getArea() {
        return side * side;
    }

    //the method is inherited from rectangle but also overridden, it works even without them
    @Override
    public int getPerimeter() {
        return 4 * side;
    }
}
