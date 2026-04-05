package ar.com.unpaz.principal;
import ar.com.unpaz.model.Vehiculo;
import ar.com.unpaz.model.Auto;
import ar.com.unpaz.model.Moto;
import ar.com.unpaz.model.Camion;
import java.util.ArrayList;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		
		vehiculos.add(new Auto("VBQ 387", "Fiat Nuova 500 ",40.0));
		vehiculos.add(new Camion("TYY 535", "Grosspal G660",10.0));
		vehiculos.add(new Moto("CSS 338", "Tehuelche", 5.0));
		
		
	    for(Vehiculo v : vehiculos) {
	    	v.avanzar(50);
			
		
		System.out.println("Tipo de Vehiculo: " + v.getTipoVehiculo());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Patente: " + v.getNroPatente());
		System.out.println("Combustible: " + v.getCantCombustible());
		System.out.println("\n**************************************");
  }
 }
}
