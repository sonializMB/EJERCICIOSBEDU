import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        // Lista segura de temas activos
        CopyOnWriteArrayList<Tema> temasActivos = new CopyOnWriteArrayList<>();

        // Agregar temas
        temasActivos.add(new Tema("Lectura comprensiva", 2));
        temasActivos.add(new Tema("Matemáticas básicas", 1));
        temasActivos.add(new Tema("Cuidado del medio ambiente", 3));
        temasActivos.add(new Tema("Matemáticas avanzadas", 3));

        // Mostrar lista ordenada alfabéticamente
        Collections.sort(temasActivos);
        System.out.println("🔠 Temas ordenados alfabéticamente:");
        for (Tema t : temasActivos) {
            System.out.println(t);
        }

        System.out.println();

        // Ordenar por prioridad tomando el uno como primero
        temasActivos.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("🔢 Temas ordenados por prioridad:");
        for (Tema t : temasActivos) {
            System.out.println(t);
        }

        System.out.println();

        // Mapa concurrente para recursos por tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();

        // Asociar recursos de los temas
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Matemáticas avanzadas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        // Mostrar los recursos por tema
        System.out.println("🔗 Recursos por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println("- " + titulo + ": " + recursos.get(titulo));
        }
    }
}