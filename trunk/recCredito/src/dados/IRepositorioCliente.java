package dados;

import java.util.Collection;
import negocio.Cliente;

/**
 *
 * @author 20081169212
 */
public interface IRepositorioCliente {
    public void inserir(Cliente cliLoja);
    public Cliente localizar(String registro);
    public boolean existe(String registro);
    public void remover(String registro);
    public void atualizar(Cliente cliLoja);
    public Collection<Cliente> listar();
}
