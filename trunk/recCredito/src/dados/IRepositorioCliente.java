/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dados;

import java.util.Collection;
import negocio.Loja;

/**
 *
 * @author 20081169212
 */
public interface IRepositorioCliente {
    public void inserir(Loja cliLoja);
    public Loja localizar(String registro);
    public boolean existe(String registro);
    public void remover(String registro);
    public void atualizar(Loja cliLoja);
    public Collection<Loja> listar();
}
