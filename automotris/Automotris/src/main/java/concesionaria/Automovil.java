package concesionaria;

/**
 * Clase <code>Automovil</code> representa una
 * automovil de la consecionaria disponible 
 * para la venta.
 * 
 * @author cabezas
 *
 */
public class Automovil {
	//atributos
	private String color;
	private String patente;
	private Boolean disponible = true;
	
	
	//construye el objeto y asigna los datos
	public Automovil(String color, String patente, Boolean disponible) {
		super();
		this.color = color;
		this.patente = patente;
		this.disponible = disponible;
	}
	
	//construye el objeto y asigna los datos
	public Automovil(String color, String patente) {
		super();
		this.color = color;
		this.patente = patente;
	}
	
	//getters y setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		//verificar si es un objeto admin con superpoderes
		this.patente = patente;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	
	//metodos de la clase
	/**
	 * Metodo que simula el arranque
	 * de un automovil
	 */
	public void arrancar() {
		//TODO: cabezas- hacer el metodo
	}
	
	public void trasladar() {
		//TODO: cabezas - hacer trasladar
		
	}
	
	

}
