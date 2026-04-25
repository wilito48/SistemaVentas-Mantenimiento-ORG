package service;

import model.Cliente;

public class DescuentoService {

    private final DescuentoFactory descuentoFactory;

    public DescuentoService() {
        this(new DescuentoFactory());
    }

    public DescuentoService(DescuentoFactory descuentoFactory) {
        this.descuentoFactory = descuentoFactory;
    }

    public double calcularTotalConDescuento(Cliente cliente, double total) {
        IDescuentoStrategy estrategia = descuentoFactory.obtenerEstrategia(cliente.getTipo());
        return estrategia.aplicarDescuento(total);
    }
}
