package service;

public class DescuentoEstudiante implements IDescuentoStrategy {

    private static final double PORCENTAJE_DESCUENTO = 0.10;

    @Override
    public double aplicarDescuento(double total) {
        return total - (total * PORCENTAJE_DESCUENTO);
    }
}
