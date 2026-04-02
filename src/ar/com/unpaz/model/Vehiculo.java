package ar.com.unpaz.model;

public abstract class Vehiculo {
	
	private String nroPatente;
	private String marca;
	protected double cantCombustible;
	
	public Vehiculo(String nroPatente, String marca, double cantCombustible ) {
		this.nroPatente = nroPatente;
		this.marca = marca;
		this.cantCombustible = cantCombustible;
	}

	public String getNroPatente() {
		return nroPatente;
	}

	public void setNroPatente(String nroPatente) {
		this.nroPatente = nroPatente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCantCombustible() {
		return cantCombustible;
	}

	public void setCantCombustible(double cantCombustible) {
		this.cantCombustible = cantCombustible;
	}
	
	public abstract void avanzar(int Km);

}
