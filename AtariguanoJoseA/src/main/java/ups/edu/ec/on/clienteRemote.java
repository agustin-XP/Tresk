package ups.edu.ec.on;

import javax.ejb.Remote;

import ups.edu.ec.modelo.Cliente;

@Remote
public interface clienteRemote {
	
	public void crearCliente(Cliente c);

}
