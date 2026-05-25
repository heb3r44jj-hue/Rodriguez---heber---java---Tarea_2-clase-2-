import java.util.Scanner;

public class Menu {

    private final AgenciaVehiculos agencia;
    private final Scanner scanner;

    public Menu(AgenciaVehiculos agencia) {
        this.agencia = agencia;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = 0;


        while (opcion !=5){
            System.out.println("Menu de opciones:");
            System.out.println("1. Registrar nuevo vehiculo");
            System.out.println("2. Mostrar todos los vehiculos");
            System.out.println("3. Buscar por placa");
            System.out.println("4. Mostrar por marca");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    agencia.mostrarTodos();
                    break;
                case 3:
                    buscarPorPlaca();
                    break;
                case 4:
                    mostrarPorMarca();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        }
    }

    public void registrarVehiculo(){
        System.out.print("Ingrese la placa:");
        String placa = scanner.nextLine();
        
        if (placa.isEmpty()){
            System.out.println("La placa no puede estar vacia");
            return;
        }

        System.out.print("Ingrese la marca:");
        String marca = scanner.nextLine();

        if (marca.isEmpty()){
            System.out.println("La marca no puede estar vacia");
            return;
        }

        System.out.print("Ingrese el modelo:");
        String modelo = scanner.nextLine();

        if (modelo.isEmpty()){
            System.out.println("El modelo no puede estar vacio");
            return;
        }

        System.out.print("Ingrese el año:");
        int anio = scanner.nextInt();
        scanner.nextLine(); 
        if (anio < 1886 || anio > 2026){
            System.out.println("Año no valido, debe estar entre 1886 y 2026");
            return;
        }

        System.out.print("Ingrese el color:");
        String color = scanner.nextLine();  
        if (color.isEmpty()){
            System.out.println("El color no puede estar vacio");
            return;
        }

        System.out.print("Ingrese el precio:");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        if (precio < 0){
            System.out.println("El precio no puede ser negativo");
            return;
        }
        Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, anio, color, precio);
        if (agencia.registrar(vehiculo)){
            System.out.println("Vehiculo registrado exitosamente");
        } else {
            System.out.println("Error: ya existe un vehiculo con esa placa");
        }

    }
    
    public void buscarPorPlaca() {
        System.out.print("Ingrese la placa a buscar: ");
        String placa = scanner.nextLine();
        if (placa.isEmpty()) {
            System.out.println("La placa no puede estar vacia");
            return;
        }
        agencia.buscarPorPlaca(placa);
    }
    public void mostrarPorMarca() {
        System.out.print("Ingrese la marca a buscar: ");
        String marca = scanner.nextLine();
        if (marca.isEmpty()) {
            System.out.println("La marca no puede estar vacia");
            return;
        }
        agencia.mostrarPorMarca(marca);
    }
}
