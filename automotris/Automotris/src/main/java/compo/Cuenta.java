package compo;

public class Cuenta {
	private Double saldo;
	private Integer nroCuenta;
	private String tipoCuenta;
	private String tipoMoneda;
	
	public Cuenta(Double saldo, Integer nroCuenta, String tipoCuenta, String tipoMoneda) {
		super();
		this.saldo = saldo;
		this.nroCuenta = nroCuenta;
		this.tipoCuenta = tipoCuenta;
		this.tipoMoneda = tipoMoneda;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(Integer nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	
	
}
