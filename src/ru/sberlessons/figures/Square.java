package ru.sberlessons.figures;

public class Square extends Figure {
    private static final String name = "Square";

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public void setA(double side) {
        this.a = side;
    }


}
