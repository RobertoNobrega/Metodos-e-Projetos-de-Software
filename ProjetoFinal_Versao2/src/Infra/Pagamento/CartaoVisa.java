package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author Carlinhos
 */
public class CartaoVisa implements CartaoTipo {

    @Override
    public void processarCompra(VendaSingleton venda) {
        System.out.println( venda.formaPagamento() + " com o Cartão Visa");
    }

}
