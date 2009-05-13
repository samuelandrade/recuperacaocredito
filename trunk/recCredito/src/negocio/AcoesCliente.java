package negocio;

/**
 *
 * @author Iuri Brito
 */
import dados.IRepositorioCliente;
import java.util.Collection;

public class AcoesCliente {
    private IRepositorioCliente repLoja;

    public AcoesCliente(IRepositorioCliente repCli){
        repLoja = repCli;
    }

    public void Cadastrar(Cliente loja){
        repLoja.inserir(loja);
    }

    public Collection<Cliente> listar(){
        return repLoja.listar();
    }
}
