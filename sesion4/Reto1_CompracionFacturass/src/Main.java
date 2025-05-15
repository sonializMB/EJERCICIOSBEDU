public class Main {
    public static void main(String[] args) {
        // Crear dos facturas con el mismo folio pero diferentes clientes
        Factura factura1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura factura2 = new Factura("FAC001", "Comercial XYZ", 1450.0);
        Factura factura3 = new Factura("FAC002", "Sonia Munoz", 1000.0);
        // Mostrar facturas
        System.out.println(factura1);
        System.out.println(factura2);
        System.out.println(factura3);

        // Comparar si son iguales
        boolean sonIgualesFacturas1y2 = factura1.equals(factura2);
        boolean sonIgualesFacturas2y3 = factura2.equals(factura3);
        System.out.println("\n¿Las facturas 1 y 2 son iguales?: " + sonIgualesFacturas1y2);

        System.out.println("¿Las facturas 2 y 3 son iguales?: " + sonIgualesFacturas2y3);
    }
}
