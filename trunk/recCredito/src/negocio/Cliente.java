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

    /**Constructor da Clase*/
    public Cliente(){
        //constructor vazio
    }
    public Cliente(String empresa, String endereco, String telefone1, String telefone2, String email, String responsavel){
        this.nomeEmpresa = empresa;
        this.endereco = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
        this.nomeResponsavel = responsavel;
    }

    /** Gets e Sets
     */
    /** atributo nomeEmpresa
     */
    public String getNomeEmpresa(){
        return this.nomeEmpresa;
    }
    public void setNomeEmpresa(String empresa){
        this.nomeEmpresa = empresa;
    }
    /** atributo endereço
     */
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String end){
        this.endereco = end;
    }
    /** atributo telefone1
     */
    public String getTelefone1(){
        return this.telefone1;
    }
    public void setTelefone1(String tel){
        this.telefone1 = tel;
    }
    /** atributo telefone2
     */
    public String getTelefone2(){
        return this.nomeEmpresa;
    }
    public void setTelefone2(String tel){
        this.telefone2 = tel;
    }
    /** atributo email
     */
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    /** atributo nomeResponsavel
     */
    public String getNomeResponsavel(){
        return this.nomeResponsavel;
    }
    public void setNomeResponsavel(String responsavel){
        this.nomeResponsavel = responsavel;
    }
}
