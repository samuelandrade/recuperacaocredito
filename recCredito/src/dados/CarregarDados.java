/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dados;

import negocio.Cliente;
import negocio.Devedor;
import negocio.Funcionario;

/**
 *
 * @author 20081169212
 */
public class CarregarDados {

    public Cliente c1;
    public Cliente c2;
    public Cliente c3;

    public CarregarDados(){
        c1 = new Cliente("123456", "IBN Soft", "Rua Padre Doido", "3658 1221", "3658 1331", "ibn@ibn.com", "Everaldo Costa");
        c2 = new Cliente("321456", "SERTA", "Campo da Sementeira", "3523 4515", "3523 1548", "serta@serta.org.br", "Paulo Roberto");
        c3 = new Cliente("325982", "Juan Calçados", "Rua honorio", "4512 2523", "4512 3562", "juan@juancalcado.com", "Juan Pedro");

        Funcionario f1 = new Funcionario("Pedro de Lara", "pedro", "senha123", 'E');
        Funcionario f2 = new Funcionario("Felipe Rodriguez", "felipe", "admin123", 'C');

        Devedor d1 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d2 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d3 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d4 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d5 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d6 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d7 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d8 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d9 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
        Devedor d0 = new Devedor("devedor 1", "Rua Rodrigo", "3658 1235", "3568 6465", 150.25);
    }
}
