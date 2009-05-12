package negocio;

/**
 *
 * @author Iuri Brito
 */
public class Devedor {
    /**Atributos da Classe*/
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
