package service;

public class DescuentoEmpresa implements IDescuentoStrategy {

    private static final double PORCENTAJE_DESCUENTO = 0.15;

    @Override
    public double aplicarDescuento(double total) {
        return total - (total * PORCENTAJE_DESCUENTO);
    }
}
