//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Factura facturaConRFC=new Factura(2500.0,"servicio de consultoria","ABCC010101XYZ");

        Factura facturaSINRFC=new Factura(1800.0,"Reparación de equipo",null);

        //Mostrar las facturas con y sin RFC
        System.out.println(facturaConRFC.getResume());
        System.out.println(facturaSINRFC.getResume());

    }
}