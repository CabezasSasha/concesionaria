package concesionaria;


public class Vendedor {
	private String nombre;
	private String apellido;
	
	public Vendedor(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
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
	
	//m�todos
	public void venderAuto(Automovil auto, Cliente cli) {
		if (auto.getDisponible()) {
			auto.setDisponible(false);
			cli.setPatenteAuto(auto.getPatente());
			System.out.println("Se vendio el auto");
			
		} else {
			System.out.println("No se puede vender el auto, no est� disponible");
		}
		
	}

}
