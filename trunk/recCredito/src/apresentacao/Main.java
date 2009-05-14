package apresentacao;

/**
 *
 * @author Iuri Brito
 */
import dados.*;
import java.util.Collection;
import java.util.Iterator;
import negocio.*;

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
        Cliente c1 = new Cliente("1234", "empresa1", "endereco 1", "99995555", "36581221", "iuri@oi.com", "joao");
        Cliente c2 = new Cliente("4321", "empresa2", "endereco 2", "299995555", "236581221", "iuri2@oi.com", "joao2");
        AcoesCliente acCliente = new AcoesCliente(new RepositorioCliente());
        acCliente.Cadastrar(c1);
        acCliente.Cadastrar(c2);
        Collection<Cliente> colecao = acCliente.listar();
		Iterator ite = colecao.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next()+"\n");
		}
    }

}
