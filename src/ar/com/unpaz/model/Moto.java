package ar.com.unpaz.model;

public class Moto extends Vehiculo{

	public Moto(String nroPatente, String marca, double cantCombustible) {
		super("Moto", nroPatente, marca, cantCombustible);
	}
	
	
	@Override
	public  void avanzar(int Km) {
			double consumo = Km / 20.0;
			if(this.cantCombustible >= consumo) {
				this.cantCombustible -= consumo;
				System.out.println("Estado: Avanzó " + Km + "Km. ");
			} else {
				System.out.println("Estado: >>>NO tiene suficiente combustible para " + Km + "Km.<<<");
  }
 }
}

