package negocio;

import dados.IRepositorioDevedor;
import java.util.Collection;

/**
 *
 * @author 20081169212
 */
public class AcoesDevedor {
    IRepositorioDevedor repDevedor;
    public AcoesDevedor(IRepositorioDevedor repDevedor){
        this.repDevedor = repDevedor;
    }

    public void Cadastrar(Devedor devedor){
        repDevedor.inserir(devedor);
    }

    public void Excluir(String text) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void Remover(String registro){
        repDevedor.remover(registro);
    }

    public void Alterar(Devedor devedor){
        repDevedor.atualizar(devedor);
    }

    public Devedor Localizar(String registro){
        return repDevedor.localizar(registro);
    }

    public Devedor Buscar(String registro){
        return null;
    }

    public Collection<Devedor> Listar(){
        return repDevedor.listar();
    }
}
