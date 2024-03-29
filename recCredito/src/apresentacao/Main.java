package apresentacao;

/**
 *
 * @author Iuri Brito
 */
import dados.*;
import java.util.Collection;
import java.util.Iterator;
import negocio.*;
import negocio.excecoes.ClienteJaExisteException;
import negocio.excecoes.ClienteNaoExisteException;

public class Main {
    /**
     * @param args the command line arguments
     */
    public Main(){
        //contructor
    }
    public void limparTela(){
        for (int i=0; i<50; i++)
            System.out.println();
    }

    public static void main(String[] args) {
       /** Inicialização dos objetos
         *
         */
        AcoesCliente acCliente = new AcoesCliente(new RepositorioCliente());
        try {
            Cliente c1 = new Cliente("1234", "empresa1", "endereco 1", "99995555", "36581221", "iuri@oi.com", "joao");
            acCliente.Cadastrar(c1);
            System.out.println("cadastro realizado");
        } catch (ClienteJaExisteException e) {
			System.out.println("Este cliente já Existe");
		} catch (ClienteNaoExisteException e){
            //
        }
        try {
            Cliente c2 = new Cliente("1234", "empresa2", "endereco 2", "299995555", "236581221", "iuri2@oi.com", "joao2");
            acCliente.Cadastrar(c2);
            System.out.println("cadastro realizado");
        } catch (ClienteJaExisteException e) {
			System.out.println("Este cliente já Existe");
		} catch (ClienteNaoExisteException e){
            
        }

        Collection<Cliente> colecao = acCliente.listar();
		Iterator ite = colecao.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next()+"\n");
        }	
    }
}
