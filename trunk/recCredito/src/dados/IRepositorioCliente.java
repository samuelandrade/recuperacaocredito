package dados;

import java.util.Collection;
import negocio.Cliente;
import negocio.excecoes.ClienteJaExisteException;
import negocio.excecoes.ClienteNaoExisteException;

/**
 *
 * @author 20081169212
 */
public interface IRepositorioCliente {
    public void inserir(Cliente cliLoja) throws ClienteJaExisteException, ClienteNaoExisteException;
    public Cliente localizar(String registro) throws ClienteNaoExisteException;
    public boolean existe(String registro)  throws ClienteNaoExisteException;
    public void remover(String registro) throws ClienteNaoExisteException;
    public void atualizar(Cliente cliLoja) throws ClienteJaExisteException, ClienteNaoExisteException;
    public Collection<Cliente> listar();
}
