/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.excecoes;

/**
 *
 * @author 20081169212
 */
public class ClienteNaoExisteException extends Exception {
    public ClienteNaoExisteException() {
		// TODO Auto-generated constructor stub
	}

	public ClienteNaoExisteException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
    public ClienteNaoExisteException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ClienteNaoExisteException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
}
