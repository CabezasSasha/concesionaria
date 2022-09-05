package compo;

public class Cliente {
	private String nombre;
	private String apellido;
	private Cuenta ctaCte;
	private Cuenta cajaAhorro;
	public Cliente(String nombre, String apellido, Cuenta ctaCte, Cuenta cajaAhorro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ctaCte = ctaCte;
		this.cajaAhorro = cajaAhorro;
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
	public Cuenta getCtaCte() {
		return ctaCte;
	}
	public void setCtaCte(Cuenta ctaCte) {
		this.ctaCte = ctaCte;
	}
	public Cuenta getCajaAhorro() {
		return cajaAhorro;
	}
	public void setCajaAhorro(Cuenta cajaAhorro) {
		this.cajaAhorro = cajaAhorro;
	}
	
	
	
	}
