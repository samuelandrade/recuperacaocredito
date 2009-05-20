package dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import negocio.Devedor;

/**
 *
 * @author 20081169212
 */
public class RepositorioDevedor implements IRepositorioDevedor {
    ArrayList<Devedor> listDevedor;

    public RepositorioDevedor(){
        listDevedor = new ArrayList<Devedor>();
    }

    public void inserir(Devedor devedor) {
        listDevedor.add(devedor);
    }

    public void remover(String registro) {
        Devedor devedor = localizar(registro);
        listDevedor.remove(devedor);
    }

    public void atualizar(Devedor devedor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean existe(String registro) {
        if (localizar(registro)!=null){
            return true;
        } else {
            return false;
        }
    }

    public Devedor localizar(String registro) {
        Iterator<Devedor> it = listDevedor.iterator();
        Devedor retorno = null;
        while(it.hasNext() && retorno == null){
            Devedor d = it.next();
            if(d.getCpf().equals(registro)){
                retorno = it.next();
            }
        }
        return retorno;
    }

    public Collection<Devedor> listar() {
        return listDevedor;
    }

}
