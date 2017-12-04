package Util.Exception;

/**
 *
 @authors
 * Carlos Alberto Nunes da Silva - Matr. 11398177
 * Roberto Freire da Nóbrega - 11228219
 */
public class BDException extends Exception {
    private String erro;

    public BDException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
