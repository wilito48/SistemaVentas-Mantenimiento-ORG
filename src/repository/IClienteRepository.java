package repository;

import model.Cliente;
import java.util.List;

public interface IClienteRepository {

    void guardar(Cliente cliente);

    Cliente buscarPorDni(String dni);

    List<Cliente> listar();
}
