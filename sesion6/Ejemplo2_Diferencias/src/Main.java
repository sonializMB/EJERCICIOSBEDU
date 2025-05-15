import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 📝 ArrayList: registrar reportes de defectos (puede haber repetidos)
        ArrayList<String> reportes = new ArrayList<>();
        reportes.add("Falla en rosca");
        reportes.add("Golpe en superficie");
        reportes.add("Falla en rosca"); // Repetido
        reportes.add("Pintura irregular");

        System.out.println("🗂️ Reportes de defectos (ordenados, con duplicados):");
        for (int i = 0; i < reportes.size(); i++) {
            System.out.println(i + 1 + ". " + reportes.get(i));
        }

        // ✅ HashSet: registrar defectos únicos
        HashSet<String> tiposDefecto = new HashSet<>(reportes); // Elimina duplicados

        System.out.println("\n✅ Tipos únicos de defecto encontrados:");
        for (String defecto : tiposDefecto) {
            System.out.println("- " + defecto);
        }

        // 🗃️ HashMap: asociar ID de lote con la causa del rechazo
        HashMap<String, String> lotesRechazados = new HashMap<>();
        lotesRechazados.put("L-001", "Falla en rosca");
        lotesRechazados.put("L-002", "Golpe en superficie");
        lotesRechazados.put("L-003", "Pintura irregular");

        System.out.println("\n📇 Lotes rechazados (ID → Causa):");
        for (Map.Entry<String, String> entry : lotesRechazados.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 🔍 Buscar causa de rechazo por ID
        String idBuscar = "L-002";
        System.out.println("\n🔍 Causa del rechazo para " + idBuscar + ": " + lotesRechazados.get(idBuscar));
    }
}