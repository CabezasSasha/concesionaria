package concesionaria;

public class Cliente {
	private String nombre;
	private String apellido;
	private String patenteAuto = "";
	
	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getPatenteAuto() {
		return patenteAuto;
	}

	public void setPatenteAuto(String patenteAuto) {
		this.patenteAuto = patenteAuto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
}
