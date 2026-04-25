package service;

import java.util.HashMap;
import java.util.Map;

public class DescuentoFactory {

    private static final String TIPO_NORMAL = "NORMAL";

    private final Map<String, IDescuentoStrategy> estrategias;

    public DescuentoFactory() {
        estrategias = new HashMap<>();
        estrategias.put("VIP", new DescuentoVIP());
        estrategias.put(TIPO_NORMAL, new DescuentoSinDescuento());
        estrategias.put("EMPRESA", new DescuentoEmpresa());
        estrategias.put("ESTUDIANTE", new DescuentoEstudiante());
    }

    public IDescuentoStrategy obtenerEstrategia(String tipoCliente) {
        if (tipoCliente == null) {
            return estrategias.get(TIPO_NORMAL);
        }

        String tipo = tipoCliente.toUpperCase();
        return estrategias.getOrDefault(tipo, estrategias.get(TIPO_NORMAL));
    }
}
