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
    private char cargo;

    /**Constructor da Classe
     */
    public Funcionario(){
        //Cosntructor vazio
    }
    public Funcionario(String nome, String login, String senha, char cargo){
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        this.setCargo(cargo);
    }

    /**Metodo para Entrar no Sistema
     */
    public boolean entrarSistema(){
        /** condição para comparar se o usuario esta cadastrado
         *  estou ultilizando dados ja predefinidos pois nao vou
         * fazer consultas num banco ou em arquivo de dados.
         */
        if(this.getLogin().equals("admin") && this.getSenha().equals("123")){
            return true;
        } else {
            return false;
        }
    }

    /** Gets e Sets
     **atributo nome
     */
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    /**atributo login
     */
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    /**atributo senha
     */
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    /**atributo cargo
     */
    public char getCargo(){
        return this.cargo;
    }
    public void setCargo(char cargo){
        this.cargo = cargo;
    }
}
