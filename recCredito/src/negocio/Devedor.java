package negocio;

/**
 *
 * @author Iuri Brito
 */
public class Devedor {
    /**Atributos da Classe*/
        private String nome;
        private String endereco;
        private String telefone;
        private String cpf;
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
       public Devedor(String nome,String cpf, String endereco, String telefone, double debito){
           this.nome = nome;
           this.cpf = cpf;
           this.endereco = endereco;
           this.telefone = telefone;
           this.status = 'A';
           this.valorDebito = debito;
       }

       public char getStatus(){
           return this.status;
       }
       public void setStatus(char status){
           this.status = status;
       }

       public String getCpf(){
           return this.cpf;
       }
}
