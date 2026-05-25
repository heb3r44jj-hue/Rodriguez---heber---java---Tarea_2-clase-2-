public class Main {
    public static void main (String[] args ){
        AgenciaVehiculos agencia = new AgenciaVehiculos();
        Menu menu = new Menu(agencia);
        menu.iniciar();
    }
    
}

