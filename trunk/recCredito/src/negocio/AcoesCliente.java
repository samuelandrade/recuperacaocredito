package negocio;

/**
 *
 * @author Iuri Brito
 */
import dados.IRepositorioCliente;
import java.util.Collection;
import negocio.excecoes.ClienteJaExisteException;
import negocio.excecoes.ClienteNaoExisteException;

public class AcoesCliente {
    private IRepositorioCliente repLoja;

    public AcoesCliente(IRepositorioCliente repCli){
        repLoja = repCli;
    }

    public void Cadastrar(Cliente loja) throws ClienteJaExisteException, ClienteNaoExisteException{
        repLoja.inserir(loja);
    }

    public Collection<Cliente> listar(){
        return repLoja.listar();
    }

    public void Excluir(String registro) throws ClienteNaoExisteException{
        repLoja.remover(registro);
    }

    public Cliente Buscar(String registro) throws ClienteNaoExisteException{
        return repLoja.localizar(registro);
    }

    public void alterar(Cliente cliente) throws ClienteJaExisteException, ClienteNaoExisteException{
        repLoja.atualizar(cliente);
    }
}
