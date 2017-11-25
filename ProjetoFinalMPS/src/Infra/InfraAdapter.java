package Infra;

import java.sql.SQLException;

/**
 *
 * @author Carlinhos
 */
public interface InfraAdapter {

    void salvarDados(Object obj) throws SQLException;

    void removerDados(String id) throws SQLException;
}
