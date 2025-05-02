// Clase que representa a un pasajero
public class Pasajero {
    private String nombre;
    private String pasaporte;

    // Constructor para inicializar el pasajero
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    // Metodo getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Metodo getter para el pasaporte
    public String getPasaporte() {
        return pasaporte;
    }
}
