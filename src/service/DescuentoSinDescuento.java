package service;

public class DescuentoSinDescuento implements IDescuentoStrategy {

    @Override
    public double aplicarDescuento(double total) {
        return total;
    }
}
