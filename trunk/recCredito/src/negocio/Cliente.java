package negocio;

/**
 *
 * @author Iuri Brito
 */
public class Cliente {
    /**Atributos da Classe*/
    private String nomeEmpresa;
    private String endereco;
    private String telefone1;
    private String telefone2;
    private String email;
    private String nomeResponsavel;

    /**Constructor da Clasee*/
    public Cliente(String empresa, String endereco, String telefone1, String telefone2, String email, String responsavel){
        this.nomeEmpresa = empresa;
        this.endereco = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
        this.nomeResponsavel = responsavel;
    }
}
