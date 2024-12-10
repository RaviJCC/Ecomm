package Interface;

import Model.clientes.Cliente;
import java.util.List;

public interface CadastroCliente {
    void cadastrarCliente(Cliente cliente);
    Cliente buscarClientePorId(int idCliente);
    void atualizarCliente(Cliente cliente);
    void removerCliente(int idCliente);
    List<Cliente> listarTodos();
}