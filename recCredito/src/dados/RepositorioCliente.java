package dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import negocio.Loja;

/**
 *
 * @author Iuri Brito
 */
public class RepositorioCliente implements IRepositorioCliente {

    private ArrayList<Loja> listLoja;

    public RepositorioCliente(){
        listLoja = new ArrayList<Loja>();
    }
    
    public void inserir(Loja cliLoja) {
        if(!existe(cliLoja.getCnpj())){
            listLoja.add(cliLoja);
        }
    }

    public Loja localizar(String registro) {
        Iterator<Loja> it = listLoja.iterator();
        Loja retorno = null;
        while(it.hasNext() && retorno == null){
            Loja cliLoja = it.next();
            if (cliLoja.getCnpj().equals(registro)){
                retorno = cliLoja;
            }
        }
        return retorno;
    }

    public boolean existe(String registro) {
        if(localizar(registro) != null){
            return true;
        } else {
            return false;
        }
    }

    public void remover(String registro) {
        listLoja.remove(localizar(registro));
    }

    public void atualizar(Loja cliLoja) {
        remover(cliLoja.getCnpj());
        inserir(cliLoja);
    }

    public Collection<Loja> listar() {
        return listLoja;
    }

}
