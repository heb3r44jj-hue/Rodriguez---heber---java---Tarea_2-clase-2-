import java.util.ArrayList;

public class AgenciaVehiculos {
    private final ArrayList<Vehiculo> listaVehiculos;

    public AgenciaVehiculos() {
        this.listaVehiculos = new ArrayList<>();
    }

    public boolean registrar(Vehiculo vehiculo) {
        for (int i = 0; i < listaVehiculos.size(); i++){
            if (listaVehiculos.get(i).getPlaca().equalsIgnoreCase(vehiculo.getPlaca())){
                return false;
            }
        }
        listaVehiculos.add(vehiculo);
        return true;
    }

    public void mostrarTodos(){
        if (listaVehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
            return;
        }
        System.out.println("Total de vehiculos registrados: " + listaVehiculos.size());
        for (Vehiculo v : listaVehiculos){       
            v.mostrarInformacion();
            System.out.println("---------------------------");
        }
    }

    public void buscarPorPlaca(String placa){
        boolean encontrado = false;
        for (int i = 0; i < listaVehiculos.size(); i++){
            if (listaVehiculos.get(i).getPlaca().equalsIgnoreCase(placa)){
                listaVehiculos.get(i).mostrarInformacion();
                encontrado = true;
                break;
            }
        } 
        if (!encontrado){
            System.out.println("Vehiculo no encontrado: " + placa);
        }
    } 

    public void mostrarPorMarca(String marca){
        boolean encontrado = false;
        for (int i = 0; i < listaVehiculos.size(); i++){
            if (listaVehiculos.get(i).getMarca().equalsIgnoreCase(marca)){
                listaVehiculos.get(i).mostrarInformacion();
                encontrado = true;
            }
        } 
        if (!encontrado){
            System.out.println("No hay vehiculos de la marca: " + marca);
        }
    } 

}