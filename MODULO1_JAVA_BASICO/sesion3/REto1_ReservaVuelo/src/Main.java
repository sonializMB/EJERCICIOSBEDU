// Clase principal donde se prueba el sistema
public class Main {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "MX123456");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Intentar reservar el asiento con el pasajero creado
        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        }

        // Mostrar el itinerario actual
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar la reserva del vuelo
        vuelo.cancelarReserva();
        System.out.println(); // Línea vacía para separar

        // Mostrar el itinerario después de cancelar
        System.out.println(vuelo.obtenerItinerario());

        // Reservar asiento usando nombre y pasaporte (sin crear objeto Pasajero)
        if (vuelo.reservarAsiento("Mario Gonzalez", "MX654321")) {
            System.out.println("✅ Reserva realizada con éxito (por nombre y pasaporte).\n");
        }

        // Mostrar el itinerario final con nuevo pasajero
        System.out.println(vuelo.obtenerItinerario());
    }
}
