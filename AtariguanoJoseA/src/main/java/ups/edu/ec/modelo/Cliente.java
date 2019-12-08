package ups.edu.ec.modelo;

import java.io.Serializable;
import java.sql.Date;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String fechaN;

	public String getFechaN() {
		return fechaN;
	}

	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}

	public String getCedula() {

		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaN=" + fechaN
				+ "]";
	}

}
