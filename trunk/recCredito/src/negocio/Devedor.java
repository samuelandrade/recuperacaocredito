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
    // <editor-fold defaultstate="collapsed" desc="Gets e Sets">
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }
    //</editor-fold>
    @Override
    public String toString(){
		return "[CPF: "+cpf+" | Nome: "+nome+" | Debito: "+valorDebito+"]";
	}
}
