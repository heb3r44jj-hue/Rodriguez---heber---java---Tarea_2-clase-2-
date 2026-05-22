public class Vehiculo{
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;

    public Vehiculo(String placa, String marca, String modelo, int año, String color, double precio) {
        this.placa = placa.toUpperCase().trim();
        this.marca = marca.trim();
        this.modelo = modelo.trim();
        this.año = año;
        this.color = color.trim();
        this.precio = precio;
    }

    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getAño() {return año;}
    public String getColor() {return color;}
    public double getPrecio() {return precio;}

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
        System.out.println("Precio: $" + precio);
    }

}
