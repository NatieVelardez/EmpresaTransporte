package ar.com.unpaz.model;

public class Auto extends Vehiculo{
	
	public Auto(String nroPatente, String marca, double cantCombustible) {
		super(nroPatente, marca, cantCombustible);
	}
	
	@Override
	public void avanzar(int Km) {
		double consumo = Km / 12.0;
		if(this.cantCombustible >= consumo) {
			this.cantCombustible -= consumo;
			System.out.println("Auto [" + getNroPatente() + "] avanzó " + Km + "Km. ");
		} else {
			System.out.println("Auto["+ getNroPatente() + "] no tiene combustible suficiente.");
		}
	}
}
