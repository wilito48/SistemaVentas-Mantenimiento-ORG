package service;

public class DescuentoNormal implements IDescuentoStrategy {

    @Override
    public double aplicarDescuento(double total) {
        return total;
    }
}
