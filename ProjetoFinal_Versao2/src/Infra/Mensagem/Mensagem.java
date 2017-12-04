package Infra.Mensagem;

/**
 *
 * @author Carlinhos
 */
public abstract class Mensagem {

    protected Mediator mediator;

    public Mensagem(Mediator m) {
        this.mediator = m;
    }

    public abstract void enviarMensagem(String mensagem);

    public abstract void receberMensagem(String mensagem);
}
