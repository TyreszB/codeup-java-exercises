package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;
    private int circles = 0;


    public Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = sc.nextDouble();
        circles++;
    }

    public double getArea(){
        double area = Math.PI * (radius * radius);
        System.out.println("Area: "+ area);
        return area;
    }

    public double getCircumference(){
        double circum = 2 * Math.PI * radius;
        System.out.println("Circumference: "+ circum);
        return circum;
    }

}
