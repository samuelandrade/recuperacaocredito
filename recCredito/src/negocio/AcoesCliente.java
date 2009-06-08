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
    private IRepositorioCliente repCliente;

    public AcoesCliente(IRepositorioCliente repCli){
        repCliente = repCli;
    }


    public void Cadastrar(Cliente cliente) throws ClienteJaExisteException, ClienteNaoExisteException{
        repCliente.inserir(cliente);
    }

    public Collection<Cliente> listar(){
        return repCliente.listar();
    }

    public void Excluir(String registro) throws ClienteNaoExisteException{
        repCliente.remover(registro);
    }

    public Cliente Buscar(String registro) throws ClienteNaoExisteException{
        return repCliente.localizar(registro);
    }

    public void Alterar(Cliente cliente) throws ClienteJaExisteException, ClienteNaoExisteException{
        repCliente.atualizar(cliente);
    }
}
