package shapes;


import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        do {
            Input inputer = new Input();
            Circle inputs = new Circle();
            inputs.getCircumference();
            inputs.getArea();
            System.out.println("Would you like to continue: ");
            inputer.yesNo();
        } while (true);
    }


}
