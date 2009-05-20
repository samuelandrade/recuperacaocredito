package dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import negocio.Cliente;
import negocio.excecoes.ClienteJaExisteException;
import negocio.excecoes.ClienteNaoExisteException;

/**
 *
 * @author Iuri Brito
 */
public class RepositorioCliente implements IRepositorioCliente {

    private ArrayList<Cliente> listLoja;

    public RepositorioCliente(){
        listLoja = new ArrayList<Cliente>();
    }
    
    public void inserir(Cliente cliLoja) throws ClienteJaExisteException, ClienteNaoExisteException{
        if(!existe(cliLoja.getCnpj())){
            listLoja.add(cliLoja);
        } else {
            throw new ClienteJaExisteException("Cliente ja existente");
        }
    }

    public Cliente localizar(String registro) throws ClienteNaoExisteException {
        Iterator<Cliente> it = listLoja.iterator();
        Cliente retorno = null;
        while(it.hasNext() && retorno == null){
            Cliente cliLoja = it.next();
            if (cliLoja.getCnpj().equals(registro)){
                retorno = cliLoja;
            }
        }
        //if (retorno != null){
           return retorno; 
        //} else {
        //   throw new ClienteNaoExisteException("Cliente nao achado!");
        //}
    }

    public boolean existe(String registro) throws ClienteNaoExisteException{
        if(localizar(registro) != null){
            return true;
        } else {
            return false;
        }
    }

    public void remover(String registro) throws ClienteNaoExisteException{
       if(localizar(registro)!= null){
        listLoja.remove(localizar(registro));
       } else {
        throw new ClienteNaoExisteException("Error: nao existe esse cliente");
       }
    }

    public void atualizar(Cliente cliLoja) throws ClienteJaExisteException, ClienteNaoExisteException {
        remover(cliLoja.getCnpj());
        inserir(cliLoja);
    }

    public Collection<Cliente> listar() {
        return listLoja;
    }

}
