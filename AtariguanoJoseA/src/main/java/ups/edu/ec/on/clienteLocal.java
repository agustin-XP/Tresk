package ups.edu.ec.on;

import javax.ejb.Local;
import javax.ejb.Remote;

import ups.edu.ec.modelo.Cliente;

@Local
public interface clienteLocal {
	
	public Cliente buscaC(String cedula) ;
	

}
