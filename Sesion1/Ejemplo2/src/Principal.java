public class Principal {
    public static void main(String[] args) {
        /* Crear mis objetos
        1. Clase
        2. Identificador
        3. new + constructor
        * */
        // Crear un nuevo objeto de tipo Estudiante
        Estudiante estudiante1 = new Estudiante();

        // Asignar valores a los atributos
        estudiante1.nombre = "Sonia Muñoz";
        estudiante1.edad = 22;

        // Llamar al método saludar() del objeto
        estudiante1.saludar();
    }
}