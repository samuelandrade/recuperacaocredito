package negocio;

import negocio.Devedor;

/**
 *
 * @author Iuri Brito
 */
public class Negociacao {
    private Bordero bordero;
    private String data;
    
    public Negociacao(){
        //constructor vazio
    }
    public Negociacao(Bordero bordero, String data){
        this.setBordero(bordero);
        this.setData(data);
    }

    public void efetuarQuitacao(Devedor dev){
        dev.setStatus('L');
    }

    public Bordero getBordero(){
        return this.bordero;
    }
    public void setBordero(Bordero bordero){
        this.bordero = bordero;
    }
    public String data(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
}
