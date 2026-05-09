package repository;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements IClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }

    // BUG intencional: comparación de DNI con == en vez de equals
    @Override
    public Cliente buscarPorDni(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni() == dni) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> listar() {
        return clientes;
    }
}
