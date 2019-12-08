package ups.edu.ec.on;


import javax.ejb.Stateless;

import ups.edu.ec.dao.clientedao;
import ups.edu.ec.modelo.Cliente;
@Stateless
public class clienteOn implements clienteRemote , clienteLocal {
	
	private clientedao clientedao = new clientedao();
	
	public void crearCliente(Cliente c) {
		System.out.println("Se incerto cliente "+c.toString());
		clientedao.crearCliente(c);
		
	}
	
	public Cliente buscaC(String cedula) {
		System.out.println("Busqueda de Cliente con cedula "+cedula);
		System.out.println(clientedao.buscarCliente(cedula).toString());
		return clientedao.buscarCliente(cedula);
	}
	
	public static void main (String args[]) {
		clienteOn c = new clienteOn();
		c.buscaC("111");
	}

	
}
