/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author 20081169212
 */
public class Bordero {
    private int codCliente;
    private int codDevedor;
    private int formaPagamento;

    public Bordero(int cCliente, int cDevedor, int fPagamento){
        this.codCliente = cCliente;
        this.codDevedor = cDevedor;
        this.formaPagamento = fPagamento;
    }
}
