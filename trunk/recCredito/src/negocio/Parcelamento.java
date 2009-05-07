package negocio;

/**
 *
 * @author Iuri Brito
 */
public class Parcelamento extends Negociacao {
    private int juros;
    private int qtdParcelas;

    public Parcelamento(){

    }
    public Parcelamento(int juros, int qtd){
        this.juros = juros;
        this.qtdParcelas = qtd;
    }

    public int getJuros(){
        return this.juros;
    }
    public void setJuros(int juros){
        this.juros = juros;
    }

    public int getQtdParcelas(){
        return this.qtdParcelas;
    }
    public void setQtdParcelas(int qtd){
        this.qtdParcelas = qtd;
    }
}
