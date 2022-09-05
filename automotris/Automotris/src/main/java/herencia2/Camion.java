package herencia2;

public class Camion extends Vehiculo {
	private Integer cantEjes;
	private Integer tara;
	private Integer tonCargadas;
	
	
	public Camion(String color, String modelo, String marca, Double km, Integer cantRuedas, String patente,
			Integer cantEjes, Integer tara, Integer tonCargadas) {
		super(color, modelo, marca, km, cantRuedas, patente);
		this.cantEjes = cantEjes;
		this.tara = tara;
		this.tonCargadas = tonCargadas;
	}


	public Integer getCantEjes() {
		return cantEjes;
	}
	
	
	public void setCantEjes(Integer cantEjes) {
		this.cantEjes = cantEjes;
	}
	
	
	public Integer getTara() {
		return tara;
	}
	
	
	public void setTara(Integer tara) {
		this.tara = tara;
	}

	
	
	public Integer getTonCargadas() {
		return tonCargadas;
	}


	public void setTonCargadas(Integer tonCargadas) {
		this.tonCargadas = tonCargadas;
	}


	/**
	 * Simula la carga de toneladas a 
	 * un camion.
	 * Veririfca que la caga no exeda 
	 * la tara del camion.
	 */
	public void cargar(Integer tonACargar) {
//		if (tonACargar >= this.getTara()) {
		if (tonACargar.intValue() >= this.getTara().intValue()) {
			System.out.println("No puede cargar mas toneladas de su tara maxima");
		} else {
			this.tonCargadas = tonACargar;
			System.out.println("Se cargo exitosamente el camion con " + tonACargar + " toneladas");
			System.out.println("Quedan " + (this.getTara() - tonACargar) + " toneladas disponibles para cargar");
		}
	}
	
	public void descargar() {
		//Todos: Cabezas
	}
}

