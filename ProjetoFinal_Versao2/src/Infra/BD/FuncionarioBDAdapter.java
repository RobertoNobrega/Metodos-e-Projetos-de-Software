package Infra.BD;

import Business.Model.Cliente;
import Business.Model.Funcionario;
import Infra.InfraAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Carlinhos
 */
public class FuncionarioBDAdapter implements InfraAdapter {

    FuncionarioBD c;

    public FuncionarioBDAdapter() {
        c = new FuncionarioBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarFuncionario((Funcionario) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerFuncionario(id);
    }

    @Override
    public boolean atualizaDados(Object obj) throws SQLException {
        return c.atualizarFuncionario((Funcionario) obj);
    }

    @Override
    public Object consultar(String id) throws SQLException {
        return c.consultarFuncionario(id);
    }

    @Override
    public ArrayList<Object> listarTodos() throws SQLException {
        ArrayList<Object> ret = new ArrayList<>();
        for (Funcionario f : c.listarTodosFuncionarios()) {
            ret.add(f);
        }
        return ret;
    }

}
