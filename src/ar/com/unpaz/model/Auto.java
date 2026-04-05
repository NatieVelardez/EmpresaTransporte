package ar.com.unpaz.model;

public class Auto extends Vehiculo{
	
	public Auto(String nroPatente, String marca, double cantCombustible) {
		super("Auto",nroPatente, marca, cantCombustible);
	}
	
	@Override
	public void avanzar(int Km) {
		double consumo = Km / 10.0;
		if(this.cantCombustible >= consumo) {
			this.cantCombustible -= consumo;
			System.out.println("Estado: Avanzó " + Km + "Km. ");
		} else {
			System.out.println(" Estado:>>>NO tiene suficiente combustible para " + Km + "Km.<<<");
  }
 }
}
