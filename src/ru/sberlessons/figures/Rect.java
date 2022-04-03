package ru.sberlessons.figures;

public class Rect extends Square {
    private static final String name = "Rectangle";

    private double a;
    private double b;


    public Rect(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
