public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", new Operador("Liz"));
        Patrulla patrulla = new Patrulla("Patrulla", new Operador("Sonis"));
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", new Operador("Sonia"));

        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }
}
