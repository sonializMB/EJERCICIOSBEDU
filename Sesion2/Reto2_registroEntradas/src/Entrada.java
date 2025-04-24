public class Entrada {

    //Atributos
    public String event;
    public double precio;

    //Constructor
    public Entrada(String event, double precio){
        this.event = event ;
        this.precio = precio;

    }

    //Metodo
    public void mostrarInformacion() {
        System.out.println("Evento: " + event + " | Precio: $" + precio);
    }

}