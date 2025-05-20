import java.io.*;
import java.nio.file.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Path rutaLog = Paths.get("src/errores.log");
        Path rutaRegistroFallos = Paths.get("src/registro_fallos.txt");

        int totalLineas = 0;
        int contadorErrores = 0;
        int contadorWarnings = 0;

        // try-with-resources para asegurar el cierre del BufferedReader
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;


                String lineaMayus = linea.toUpperCase(Locale.ROOT);

                if (lineaMayus.contains("ERROR")) {
                    contadorErrores++;
                }

                if (lineaMayus.contains("WARNING")) {
                    contadorWarnings++;
                }
            }

            System.out.println("📊 Resumen del archivo de logs:");
            System.out.println("📄 Total de líneas leídas: " + totalLineas);
            System.out.println("❌ Errores encontrados: " + contadorErrores);
            System.out.println("⚠️ Advertencias encontradas: " + contadorWarnings);

            //Porcentaje de lineas con errores
            double porcentajeErroes = ((double)(contadorErrores ) / totalLineas) * 100;
            System.out.printf("📈 Porcentaje de líneas con errores: %f%%\n", porcentajeErroes);
            //Porcentaje de lineas con advertencia
            double porcentajeWarning = ((double)(contadorWarnings) / totalLineas) * 100;
            System.out.printf("📈 Porcentaje de líneas con advertencias: %f%%\n", porcentajeWarning);
            //Porcentaje de lineas con advertencia Y ERRORES
            double porcentajeWarningErrores = ((double)(contadorErrores+contadorWarnings) / totalLineas) * 100;
            System.out.printf("📈 Porcentaje de líneas con advertencias y Errores: %f%%\n", porcentajeWarningErrores);

        } catch (IOException e) {
            // Si algo sale mal, escribe el mensaje en registro_fallos.txt
            try {
                Files.writeString(rutaRegistroFallos, "❗ Ocurrió un error al leer el archivo: " + e.getMessage());
                System.out.println("📝 Error registrado en " + rutaRegistroFallos);
            } catch (IOException ex) {
                System.out.println("❌ Error al escribir en el archivo de fallos: " + ex.getMessage());
            }
        }
    }
}
