package ar.com.unpaz.principal;
import ar.com.unpaz.model.Vehiculo;
import ar.com.unpaz.model.Auto;
import ar.com.unpaz.model.Moto;
import ar.com.unpaz.model.Camion;
import java.util.ArrayList;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		//Creo la lista de la clase Padre(Vehiculo)
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		//Agrego objetos (nroPatente, marca, cantCombustible)
		vehiculos.add(new Auto("VBQ 387", "Fiat Nuova 500 ",40.0));
		vehiculos.add(new Camion("TYY 535", "Grosspal G660",10.0));
		vehiculos.add(new Moto("CSS 338", "Tehuelche", 5.0));
		
		// utilizo forEach
	    for(Vehiculo v : vehiculos) {
			v.avanzar(50); // cada vehiculo 
			
		// Muestro los datos dentro del forEach
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Patente: " + v.getNroPatente());
		System.out.println("Combustible: " + v.getCantCombustible());
		System.out.println("\n**************************************");
			
		}
	}
	
}
