package negocio;

import negocio.Devedor;
import negocio.Loja;

/**
 *
 * @author Iuri Brito
 */
public class Bordero {
    /**Atributos da Classe*/
    private Loja cliente;
    private Devedor devedor;
    private char formaPagamento;

    /**Constructor da Classe*/
    public Bordero(){
        //constructor vazio
    }
    public Bordero(Loja cCliente, Devedor cDevedor, char fPagamento){
        this.cliente = cCliente;
        this.devedor = cDevedor;
        this.formaPagamento = fPagamento;
    }

    
    /**Gets e Sets
     *atributo cliente
     */
    public Loja getCliente(){
        return this.cliente;
    }
    public void setCliente(Loja cli){
        this.cliente = cli;
    }
    /**atributo devedor
     */
    public Devedor getDevedor(){
        return this.devedor;
    }
    public void setCliente(Devedor dev){
        this.devedor = dev;
    }
    /**atributo formaPagamento
     */
    public char getFormaPagamento(){
        return this.formaPagamento;
    }
    public void setFormaPagamento(char pagamento){
        this.formaPagamento = pagamento;
    }
}
