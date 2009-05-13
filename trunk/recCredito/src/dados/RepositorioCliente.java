package dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import negocio.Cliente;

/**
 *
 * @author Iuri Brito
 */
public class RepositorioCliente implements IRepositorioCliente {

    private ArrayList<Cliente> listLoja;

    public RepositorioCliente(){
        listLoja = new ArrayList<Cliente>();
    }
    
    public void inserir(Cliente cliLoja) {
        if(!existe(cliLoja.getCnpj())){
            listLoja.add(cliLoja);
        }
    }

    public Cliente localizar(String registro) {
        Iterator<Cliente> it = listLoja.iterator();
        Cliente retorno = null;
        while(it.hasNext() && retorno == null){
            Cliente cliLoja = it.next();
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

    public void atualizar(Cliente cliLoja) {
        remover(cliLoja.getCnpj());
        inserir(cliLoja);
    }

    public Collection<Cliente> listar() {
        return listLoja;
    }

}
