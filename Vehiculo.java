public class Vehiculo{
    private final String placa;
    private final String marca;
    private final String modelo;
    private final int anio;
    private final String color;
    private final double precio;

    public Vehiculo(String placa, String marca, String modelo, int anio, String color, double precio) {
        this.placa = placa.toUpperCase().trim();
        this.marca = marca.trim();
        this.modelo = modelo.trim();
        this.anio = anio;
        this.color = color.trim();
        this.precio = precio;
    }

    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getAnio() {return anio;}
    public String getColor() {return color;}
    public double getPrecio() {return precio;}

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Precio: $" + precio);
    }

}
