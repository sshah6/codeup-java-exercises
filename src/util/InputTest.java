package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
//        System.out.println(input.yesNo());

//        input.getInt(1, 10);
//        System.out.println("User entered " + input.getInt());

        input.getDouble(1.0, 10.0);
        System.out.println("User entered " + input.getDouble());

    }
}
