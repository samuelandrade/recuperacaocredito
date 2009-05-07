package negocio;

/**
 *
 * @author Iuri Brito
 */
public class Devedor {
    /**Atributos da Classe*/
       private String nome;
       private String endereco;
       private String telefone1;
       private String telefone2;
       private double valorDebito;
       private char status;
       /**Tipos de Status
        * A=Aberto;
        * L=Liquidado;
        * P=Parcelado.
        */

       /**Constructor da Classe*/
       public Devedor(){
           //constructor vazio
       }
       public Devedor(String nome, String endereco, String telefone1, String telefone2, double debito){
           this.nome = nome;
           this.endereco = endereco;
           this.telefone1 = telefone1;
           this.telefone2 = telefone2;
           this.status = 'A';
           this.valorDebito = debito;
       }

       public char getStatus(){
           return this.status;
       }
       public void setStatus(char status){
           this.status = status;
       }
}
