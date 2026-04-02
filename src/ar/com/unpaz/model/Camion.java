package ar.com.unpaz.model;

public class Camion extends Vehiculo {
	public Camion(String nroPatente, String marca, double cantCombustible) {
		super(nroPatente, marca, cantCombustible);
	}
	
	
	@Override
	public void avanzar(int Km) {
		double consumo = Km / 4.0; // CONDICION 
		if(this.cantCombustible >= consumo) {//si la cantidad de combustible es mayor igual al consumo que avance 50km
			this.cantCombustible -= consumo;
			System.out.println("Camion [" + getNroPatente() + "] avanzó " + Km + "Km. ");
		} else {// de lo contrario, no tendra tiene suficiente combustible 
			System.out.println("Camion ["+ getNroPatente() + "] no tiene combustible suficiente.");
		}
	}
}