/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author iuri.brito
 */
public class Cliente {
    private String nomeEmpresa;
    private String endereco;
    private String telefone1;
    private String telefone2;
    private String email;
    private String nomeResponsavel;

    public Cliente(String empresa, String endereco, String telefone1, String telefone2, String email, String responsavel){
        this.nomeEmpresa = empresa;
        this.endereco = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
        this.nomeResponsavel = responsavel;
    }
}
