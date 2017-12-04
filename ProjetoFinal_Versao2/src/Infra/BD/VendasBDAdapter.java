package Infra.BD;

import Business.Model.VendaSingleton;
import Infra.InfraAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Carlinhos
 */
public class VendasBDAdapter implements InfraAdapter {

    VendaBD c;

    public VendasBDAdapter() {
        c = new VendaBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarVenda((VendaSingleton) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerVenda(id);
    }

    @Override
    public boolean atualizaDados(Object obj) throws SQLException {
        return c.atualizarVenda((VendaSingleton) obj);
    }

    @Override
    public Object consultar(String id) throws SQLException {
        return c.consultarVenda(id);
    }

    @Override
    public ArrayList<Object> listarTodos() throws SQLException {
        ArrayList<Object> ret = new ArrayList<>();
        for (VendaSingleton v : c.listarTodasVendas()) {
            ret.add(v);
        }
        return ret;
    }

}
