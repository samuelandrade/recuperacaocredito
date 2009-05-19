/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.excecoes;

/**
 *
 * @author 20081169212
 */
public class ClienteJaExisteException extends Exception {
    public ClienteJaExisteException() {
		// TODO Auto-generated constructor stub
	}

	public ClienteJaExisteException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
    public ClienteJaExisteException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ClienteJaExisteException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
}
