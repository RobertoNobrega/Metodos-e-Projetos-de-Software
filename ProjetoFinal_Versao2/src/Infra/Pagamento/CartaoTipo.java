package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author Carlinhos
 */
public interface CartaoTipo {
    void processarCompra(VendaSingleton venda);
}
