public class Main {
    public static void main(String[] args) {
        // Primeras dos entradas manuales
        Entrada entrada_1 = new Entrada("Concierto feliz", 225.50);
        Entrada entrada_2 = new Entrada("Obra de teatro", 1225.50);

        //Uso del metodo para mostrar la informacion
        entrada_1.mostrarInformacion();
        entrada_2.mostrarInformacion();



        //Entrada nueva
        Entrada_Record entrada_3 = new Entrada_Record("Festival feliz", 256.23);

        // Muestra el toString() generado automáticamente por el record.
        System.out.println(entrada_3);

    }
}
