package service;

public class DescuentoVIP implements IDescuentoStrategy {

    private static final double PORCENTAJE_DESCUENTO = 0.20;

    @Override
    public double aplicarDescuento(double total) {
        return total - (total * PORCENTAJE_DESCUENTO);
    }
}
