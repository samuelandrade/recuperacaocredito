package negocio;

/**
 *
 * @author Iuri Brito
 */
public class Funcionario {
    /**Atributos da Classe*/
    private String nome;
    private String login;
    private String senha;
    private String cargo;

    /**Constructor da Classe*/
    public Funcionario(String nome, String login, String senha, String cargo){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }
}
