import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Registrar orden de llegada de muestras (pueden repetirse)
        ArrayList<String> muestrasEnOrden = new ArrayList<>();
        muestrasEnOrden.add("Homo sapiens");
        muestrasEnOrden.add("Mus musculus");
        muestrasEnOrden.add("Arabidopsis thaliana");
        muestrasEnOrden.add("Homo sapiens");
        muestrasEnOrden.add("Mus musculus");
        muestrasEnOrden.add("Mus musculus");

        // Mostrar todas las muestras en orden de llegada
        System.out.println("📥 Muestras en orden de llegada:");
        for (String especie : muestrasEnOrden) {
            System.out.println("- " + especie);
        }

        System.out.println();

        //Obtener especies únicas con HashSet
        HashSet<String> especiesUnicas = new HashSet<>(muestrasEnOrden);

        // Mostrar especies únicas
        System.out.println("🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println();

        //Asociar ID de muestra con nombre del investigador
        HashMap<String, String> mapaMuestras = new HashMap<>();
        mapaMuestras.put("M-001", "Dra. López");
        mapaMuestras.put("M-002", "Dr. Hernández");
        mapaMuestras.put("M-003", "Dra. Méndez");

        //Mostrar relación ID → Investigador
        System.out.println("🧑‍🔬 Relación de ID de muestra con investigador:");
        for (Map.Entry<String, String> entrada : mapaMuestras.entrySet()) {
            System.out.println("- " + entrada.getKey() + " → " + entrada.getValue());
        }

        System.out.println();

        //Buscar investigador por ID de muestra
        String idBusqueda = "M-001";
        if (mapaMuestras.containsKey(idBusqueda)) {
            System.out.println("🔍 Búsqueda por ID: " + idBusqueda);
            System.out.println("👨‍🔬 Investigador: " + mapaMuestras.get(idBusqueda));
        } else {
            System.out.println("❌ No se encontró la muestra con ID: " + idBusqueda);
        }
    }
}