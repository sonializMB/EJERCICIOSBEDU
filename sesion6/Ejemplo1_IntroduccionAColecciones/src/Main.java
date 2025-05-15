import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 📦 List: Registrar orden de llegada de materiales
        List<String> materialesRecibidos = new ArrayList<>();
        materialesRecibidos.add("Tornillo M6");
        materialesRecibidos.add("Arandela 8mm");
        materialesRecibidos.add("Tornillo M6"); // Llega repetido
        materialesRecibidos.add("Tuerca M6");

        System.out.println("📋 Orden de llegada de materiales:");
        for (String material : materialesRecibidos) {
            System.out.println("- " + material);
        }

        // 🧪 Set: Validar lotes únicos (sin duplicados)
        Set<String> lotesUnicos = new HashSet<>();
        lotesUnicos.add("Lote-001");
        lotesUnicos.add("Lote-002");
        lotesUnicos.add("Lote-001"); // Duplicado que será ignorado

        System.out.println("\n✅ Lotes registrados (sin duplicados):");
        for (String lote : lotesUnicos) {
            System.out.println("- " + lote);
        }

        // 🗃️ Map: Código de pieza asociado a descripción
        Map<String, String> catalogoPiezas = new HashMap<>();
        catalogoPiezas.put("PZ-1001", "Tornillo M6 x 20mm");
        catalogoPiezas.put("PZ-1002", "Tuerca M6");
        catalogoPiezas.put("PZ-1003", "Arandela 8mm");

        System.out.println("\n📇 Catálogo de piezas (Código -> Descripción):");
        for (Map.Entry<String, String> entrada : catalogoPiezas.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // 🔎 Buscar descripción a partir del código
        String codigoBuscado = "PZ-1002";
        System.out.println("\n🔍 Descripción de la pieza " + codigoBuscado + ": " + catalogoPiezas.get(codigoBuscado));
    }
}