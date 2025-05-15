public class Main {
    public static void main(String[] args) {
        // Crear la declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Crear la cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAX010101000", 9500.0);

        // Mostrar la información
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() +
                ", saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar si los RFC coinciden
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println((rfcValido ? "✅" : "❌") + " ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
