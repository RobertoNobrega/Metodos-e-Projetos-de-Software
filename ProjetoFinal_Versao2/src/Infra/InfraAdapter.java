package Infra;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Carlinhos
 */
public interface InfraAdapter {

    void salvarDados(Object obj) throws SQLException;

    void removerDados(String id) throws SQLException;

    boolean atualizaDados(Object obj) throws SQLException;

    Object consultar(String id) throws SQLException;

    ArrayList<Object> listarTodos() throws SQLException;

}
