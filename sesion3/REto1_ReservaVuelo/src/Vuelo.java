// Clase que representa un vuelo
public class Vuelo {
    // Atributo final: el código del vuelo no cambia
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;

    // Pasajero que tiene el asiento reservado (puede ser null si no hay reserva)
    private Pasajero asientoReservado;

    // Constructor para inicializar los datos del vuelo
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null; // Sin reserva al inicio
    }

    // Metodo para reservar un asiento usando un objeto Pasajero
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true; // Reserva exitosa
        }
        return false; // Ya había alguien reservado
    }

    // Metodo sobrecargado: permite reservar solo con nombre y pasaporte
    public boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null) {
            asientoReservado = new Pasajero(nombre, pasaporte); // Se crea el pasajero internamente
            return true;
        }
        return false;
    }

    // Cancela la reserva eliminando al pasajero
    public void cancelarReserva() {
        asientoReservado = null;
        System.out.println("❌ Cancelando reserva...");
    }

    // Devuelve un string con toda la información del vuelo
    public String obtenerItinerario() {
        // Si hay pasajero, muestra el nombre; si no, indica que no hay reserva
        String pasajeroInfo = (asientoReservado != null)
                ? asientoReservado.getNombre()
                : "[Sin reserva]";

        return String.format("""
                ✈️ Itinerario del vuelo:
                Código: %s
                Destino: %s
                Salida: %s
                Pasajero: %s
                """, codigoVuelo, destino, horaSalida, pasajeroInfo);
    }
}
