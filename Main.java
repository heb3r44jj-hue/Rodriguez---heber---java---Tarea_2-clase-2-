public class Main {
    public static void main (String[] args ){
        AgenciaVehicular agencia = new AgenciaVehicular();
        Menu menu = new Menu(agencia);
        menu.iniciar();
    }
    
}

