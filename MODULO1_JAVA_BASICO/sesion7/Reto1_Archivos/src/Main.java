import java.io.IOException;
import java.nio.file.*;

public class Main {

    // Metodo que guarda los parámetros en el archivo
    public static void guardarParametros(Path rutaArchivo, String contenido) {
        try {
            // Verifica si el directorio existe, si no, lo crea
            Path carpeta = rutaArchivo.getParent();
            if (Files.notExists(carpeta)) {
                Files.createDirectories(carpeta);
                System.out.println("📁 Carpeta creada: " + carpeta.toString());
            }

            // Escribe el contenido en el archivo
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("✅ Archivo creado exitosamente: " + rutaArchivo.toString());

        } catch (IOException e) {
            System.out.println("❌ Error al guardar los parámetros: " + e.getMessage());
        }
    }

    // Metodo que lee el contenido del archivo y lo imprime
    public static void leerParametros(Path rutaArchivo) {
        try {
            if (Files.exists(rutaArchivo)) {
                String contenido = Files.readString(rutaArchivo);
                System.out.println("📄 Contenido del archivo:");
                System.out.println("--------------------------");
                System.out.println(contenido);
            } else {
                System.out.println("⚠️ El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Define la ruta del archivo dentro de la carpeta config/
        Path rutaArchivo = Paths.get("src/parametros.txt");

        // Contenido del archivo de parámetros
        String parametros = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8
            FUNCIONOOOOOOOOOOOO
            """;

        // Guardar En el archivo
        guardarParametros(rutaArchivo, parametros);
        leerParametros(rutaArchivo);
    }
}