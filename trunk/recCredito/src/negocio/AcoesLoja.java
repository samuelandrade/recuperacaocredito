package negocio;

/**
 *
 * @author Iuri Brito
 */
import dados.IRepositorioCliente;
import java.util.Collection;

public class AcoesLoja {
    private IRepositorioCliente repLoja;

    public AcoesLoja(IRepositorioCliente repCli){
        repLoja = repCli;
    }

    public void Cadastrar(Loja loja){
        repLoja.inserir(loja);
    }

    public Collection<Loja> listar(){
        return repLoja.listar();
    }
}
