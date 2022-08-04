package test;

import datos.ClienteDAO;
import entity.Cliente;
import java.util.List;

/**
 *
 * @author PatitoSystems
 */
public class TestCliente {

    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        // select
//        
//        List<Cliente> clientes = clienteDAO.getClientes();
//
//        for (Cliente cliente: clientes) {
//            System.out.println("cliente = " + cliente);
//        }

        // insert
//        Cliente cliente = new Cliente(8, "Scarlett", "Johannson", "doitme@mail.com", "32214651", "mamiRiki", 0, null);
//        clienteDAO.insert(cliente);
//        
//        List<Cliente> clientes = clienteDAO.getClientes();
//
//        for (Cliente clienteInserted : clientes) {
//            System.out.println("Cliente = " + clienteInserted);
//        }
        // update
//        Cliente cliente = new Cliente(9, "Scarlett", "Johannson", null, "32214651", "mamiRiki", 0, null);
//        clienteDAO.update(cliente);
//
//        List<Cliente> clientes = clienteDAO.getClientes();
//
//        for (Cliente clienteUpdated : clientes) {
//            System.out.println("Cliente = " + clienteUpdated);
//        }
        // delete
//        Cliente cliente = new Cliente(9);
//        clienteDAO.delete(cliente);
//
//        List<Cliente> clientes = clienteDAO.getClientes();
//
//        for (Cliente clienteDeleted : clientes) {
//            System.out.println("CLIENTE = " + clienteDeleted);
//        }
        // SELECT APELLIDO
        List<Cliente> clientes = clienteDAO.getClientesByApellido();

        for (Cliente cliente : clientes) {
            System.out.println("cliente = " + cliente);
        }
    }
}
