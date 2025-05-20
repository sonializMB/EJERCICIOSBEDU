import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> registros = new HashSet<>();
        boolean seguir = true;

        System.out.println("🖥️ Ingreso de consumo de CPU por servidor (porcentaje). Escribe 'fin' para terminar.");

        while (seguir) {
            System.out.print("Ingrese consumo de CPU: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                seguir = false;
                break;
            }

            try {
                double consumo = Double.parseDouble(entrada);

                // Validaciones
                if (consumo < 0 || consumo > 100) {
                    System.out.println("❌ Valor fuera de rango (0-100%).");
                    continue;
                }

                if (registros.contains(consumo)) {
                    System.out.println("⚠️ Dato duplicado. No se registra.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("🚨 Consumo crítico detectado: " + consumo + "%");
                }

                registros.add(consumo);
                System.out.println("✅ Registro exitoso: " + consumo + "%");

            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada no válida. Debe ser un número.");
            } catch (ConsumoCriticoException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("❌ Error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("📊 Registro finalizado. Valores únicos registrados: " + registros);
    }
}
