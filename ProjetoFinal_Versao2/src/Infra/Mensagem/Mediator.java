package Infra.Mensagem;

import Infra.Mensagem.Mensagem;

/**
 *
 * @author Carlinhos
 */
public interface Mediator {

    void enviar(String mensagem, Mensagem mens);

    void receber(String mensagem, Mensagem mens);

}
