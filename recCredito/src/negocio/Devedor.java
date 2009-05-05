/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author iuri.brito
 */
public class Devedor {
       private String nome;
       private String endereco;
       private String telefone1;
       private String telefone2;
       private char status;
       private double valorDebito;

       public Devedor(String nome, String endereco, String telefone1, String telefone2, double debito){
           this.nome = nome;
           this.endereco = endereco;
           this.telefone1 = telefone1;
           this.telefone2 = telefone2;
           this.status = 'A';
           this.valorDebito = debito;
       }
}
