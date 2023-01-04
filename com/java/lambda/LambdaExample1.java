package com.java.lambda;

interface Shape {
    void draw();
}
public class LambdaExample1 {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("draw method from rectangle class");
        rectangle.draw();

        Shape Square = ()-> System.out.println("Draw method from Square");
        Square.draw();

        Shape circle= ()-> System.out.println("draw method from circle");
        circle.draw();
    }


}
