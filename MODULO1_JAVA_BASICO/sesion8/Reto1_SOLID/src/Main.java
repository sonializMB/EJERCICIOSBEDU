public class Main {
    public static void main(String[] args) {
        // Inyección de dependencias
        GestorDialogo dialogo = new DialogoTexto();
        TransicionHistoria transicion = new TransicionSimple();
        LogicaDecision decision = new DecisionBinaria();

        // Simulación narrativa
        dialogo.mostrarDialogo("¡La aventura ha comenzado!");
        String eleccion = decision.obtenerDecision();
        transicion.avanzarEscena(eleccion);

        if (eleccion.equals("si")) {
            dialogo.mostrarDialogo("Has aceptado el reto. ¡Prepárate para la aventura!");
        } else {
            dialogo.mostrarDialogo("Has decidido no continuar. La historia termina aquí.");
        }
    }
}
