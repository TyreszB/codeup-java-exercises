package util;

public class InputTest {
    public static void main(String[] args) {
        Input inputs = new Input();
        inputs.getString();
        inputs.yesNo();
        inputs.getInt(1,10);
        inputs.getInt();
        inputs.getDouble(0.01,9.99);
        inputs.getDouble();
    }
}
