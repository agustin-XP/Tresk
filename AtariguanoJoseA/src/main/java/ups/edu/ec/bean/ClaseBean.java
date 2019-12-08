package ups.edu.ec.bean;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ups.edu.ec.modelo.Cliente;
import ups.edu.ec.on.clienteLocal;

@ManagedBean
public class ClaseBean {
	
	
	private Cliente c = new Cliente();
	@Inject
	private clienteLocal clienteLocal;
	
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	
	public String bucaCliente() {
		String cedula = c.getCedula();
		c = clienteLocal.buscaC(cedula);
		System.out.println("Solicitando Cliente con cedula "+c.toString());
		return  null;
	}
	
	
}
