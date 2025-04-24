public record Entrada_Record(String event, double precio) {
    public void mostrarInformacion() {
        System.out.println("Evento: " + event + " | Precio: $" + precio);
    }
}