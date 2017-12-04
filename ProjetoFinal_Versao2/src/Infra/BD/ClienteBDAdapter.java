package Infra.BD;

import Business.Model.Cliente;
import Infra.InfraAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Carlinhos
 */
public class ClienteBDAdapter implements InfraAdapter {

    ClienteBD c;

    public ClienteBDAdapter() {
        c = new ClienteBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarCliente((Cliente) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerCliente(id);
    }

    @Override
    public boolean atualizaDados(Object obj) throws SQLException {
        return c.atualizarCliente((Cliente) obj);
    }

    @Override
    public Object consultar(String id) throws SQLException {
        return c.consultarCliente(id);
    }

    @Override
    public ArrayList<Object> listarTodos() throws SQLException {
        ArrayList<Object> ret = new ArrayList<>();
        for (Cliente cl : c.listarTodosClientes()) {
            ret.add(cl);
        }
        return ret;
    }

}
