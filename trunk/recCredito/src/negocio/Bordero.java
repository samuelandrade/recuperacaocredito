package negocio;

/**
 *
 * @author Iuri Brito
 */
public class Bordero {
    /**Atributos da Classe*/
    private int codCliente;
    private int codDevedor;
    private int formaPagamento;

    /**Constructor da Classe*/
    public Bordero(int cCliente, int cDevedor, int fPagamento){
        this.codCliente = cCliente;
        this.codDevedor = cDevedor;
        this.formaPagamento = fPagamento;
    }
}
