package ru.sberlessons.converters;

public class Temperature {

    public static void main(String[] args) {
        TemperatureInterfaceImpl temp = new TemperatureInterfaceImpl();
        double cells = 2;

        System.out.println("Fahrenheit  = " + temp.getF(cells));
        System.out.println("Kelvin  = " + temp.getK(cells));


    }
}
