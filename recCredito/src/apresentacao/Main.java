package apresentacao;

/**
 *
 * @author Iuri Brito
 */
import negocio.*;
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        Funcionario sessaoFunc = new Funcionario();
        Main tl = new Main();


        System.out.println("Digite o Usuario: ");
        String login = in.nextLine();
        System.out.print("Digite a Senha: ");
        String senha = in.nextLine();
        sessaoFunc.setLogin(login);
        sessaoFunc.setSenha(senha);
        
        if(sessaoFunc.entrarSistema()){
            int op = 10;
            while(op != 0) {
                System.out.print("Digite a opção do menu:\n 1- Cadastrar Cliente \n 2- Cadastrar Bordero \n 3- Cadastrar Devedor \n 0- Sair");
                op = in.nextInt();
                switch(op){
                    case 1:
                        tl.limparTela();
                        System.out.print("**Cadastrar Cliente**\n");
                        break;
                    case 2:
                        tl.limparTela();
                        System.out.print("**Cadastrar bordero**\n");
                        break;
                    case 3:
                        tl.limparTela();
                        System.out.print("**Cadastrar funcionario**\n");
                        break;
                    case 0:
                        tl.limparTela();
                        System.out.print("Xau...");
                        break;
                    default:
                        tl.limparTela();
                        System.out.print("**Opção nao existe escolha outra**\n");
                }
            }
            
        } else {
            System.out.print("Senha ou usuario incorreto");
        }


    }
}
