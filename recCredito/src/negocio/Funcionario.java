/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author iuri.brito
 */
public class Funcionario {
    
    private String nome;
    private String login;
    private String senha;
    private String cargo;

    public Funcionario(String nome, String login, String senha, String cargo){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }
}
