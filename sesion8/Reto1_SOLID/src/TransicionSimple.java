// Implementación de transición simple
class TransicionSimple implements TransicionHistoria {
    @Override
    public void avanzarEscena(String decision) {
        System.out.println("📜 Avanzando escena según decisión: " + decision);
    }
}
