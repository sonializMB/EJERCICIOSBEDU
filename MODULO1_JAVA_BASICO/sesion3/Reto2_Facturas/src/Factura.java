import java.util.Optional;
public class Factura {
    //Atributos para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //Constructor que convietre el RFC en Opctional, puede ser null
    public Factura(double monto, String descripcion, String rfc){
        this.monto =monto;
        this.descripcion=descripcion;
        this.rfc=Optional.ofNullable(rfc);
    }

    //Metodo público que devuelve un resumen de la factura
    public String getResume() {
        String resume = "📄 Factura generada:\n";
        resume +="Descripcion: "+descripcion+"\n";
        resume +="Monto: $"+monto+"\n";

        //Si el RFC está presente, se muestra. Sino se muestra un mensaje
        resume +="RFC: "+rfc.orElse("No proporcionado")+"\n";
        return  resume;
    }
}
