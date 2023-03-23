import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creamos los objetos buses
        ArrayList<Bus> listaBuses = new ArrayList<>();
        listaBuses.add(new Bus("1"));
        listaBuses.add(new Bus("2"));
        listaBuses.add(new Bus("3"));
        listaBuses.add(new Bus("4"));
        listaBuses.add(new Bus("5"));
        listaBuses.add(new Bus("6"));
        listaBuses.add(new Bus("7"));
        listaBuses.add(new Bus("8"));
        listaBuses.add(new Bus("9"));
        listaBuses.add(new Bus("10"));
        listaBuses.add(new Bus("11"));
        listaBuses.add(new Bus("12"));
        //Creamos la clase empresa
        Empresa empresa= new Empresa("Condor",listaBuses );
        //cremos nuevos buses y agregamos a la flota de de la empresa
        listaBuses.add(new Bus("13"));
        listaBuses.add(new Bus("14"));
        // Quitamos los buses antiguos
        empresa.eliminarBusesPorPatente("1");
        empresa.eliminarBusesPorPatente("2");
        empresa.imprimirBuses();








    }
}
