import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;            // Inmutable después de la creación
    private double saldoDisponible;

    // Constructor con validación
    public CuentaFiscal(String rfc, double saldoDisponible) {
        if (saldoDisponible < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible;
    }

    // Getters
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Metodo que valida el RFC comparándolo con el de la declaración
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }
}
