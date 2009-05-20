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

    public void cadastrar(Devedor devedor){
        repDevedor.inserir(devedor);
    }

    public void remover(String registro){
        repDevedor.remover(registro);
    }

    public void atualizar(Devedor devedor){
        repDevedor.atualizar(devedor);
    }

    public Devedor localizar(String registro){
        return repDevedor.localizar(registro);
    }

    public Collection<Devedor> listar(){
        return repDevedor.listar();
    }
}
