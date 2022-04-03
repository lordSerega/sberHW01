package ru.sberlessons.converters;

public class TemperatureInterfaceImpl implements TemperatureInterface {


    @Override
    public double getF(double c) {
        return ((double) (9 / 5) * (c + 32));
    }

    @Override
    public double getK(double c) {
        return ((double) (9 / 5) * (c + 273.15));
    }
}
