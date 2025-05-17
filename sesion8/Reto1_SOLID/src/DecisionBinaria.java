import java.util.Scanner;
// Implementación de una decisión binaria
class DecisionBinaria implements LogicaDecision {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String obtenerDecision() {
        System.out.print("¿Aceptar el reto? (si/no): ");
        return scanner.nextLine().trim().toLowerCase();
    }
}