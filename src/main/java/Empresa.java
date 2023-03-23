import java.util.ArrayList;

public class Empresa {
	private String nombre;

	public Empresa(String nombre, ArrayList<Bus> buses) {
		this.nombre = nombre;
		this.buses = buses;
	}

	public ArrayList<Bus> getBuses() {
		return buses;
	}

	public void setBuses(ArrayList<Bus> buses) {
		this.buses = buses;
	}


	private ArrayList<Bus> buses = new ArrayList<Bus>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void eliminarBusesPorPatente(String patente){
		for (	Bus busess : buses) {
			if (busess.getPatente().equals(patente)) {
			buses.remove(busess);
			return;
			}

		}


	}
   public void imprimirBuses(){
		for (Bus buse : buses) {
			System.out.println("Nombre:" + buse.getPatente());
			//System.out.println("Nombre: " + venta.getNombre());
			}

	}


}

