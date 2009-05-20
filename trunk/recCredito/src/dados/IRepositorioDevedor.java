/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dados;

import java.util.Collection;
import negocio.Devedor;

/**
 *
 * @author 20081169212
 */
public interface IRepositorioDevedor {
    public void inserir(Devedor devedor);
    public void remover(String registro);
    public void atualizar(Devedor devedor);
    public boolean existe(String registro);
    public Devedor localizar(String registro);
    public Collection<Devedor> listar();
}
