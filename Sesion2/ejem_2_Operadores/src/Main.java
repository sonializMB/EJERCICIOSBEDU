public class Main {
    /*
    Contexto del ejemplo

        Imagina que estás programando un sistema de facturación para una cafetería.
        Un cliente compró varios productos y se desea calcular el total de su compra,
        verificar si supera cierto límite para aplicar descuento, y mostrar el
        resultado final de forma clara.

    */
    public static void main(String[] args) {
        // Precios unitarios
        double precioCafe = 45.50;
        double precioPastel = 80.00;
        double precioAgua = 20.00;

        // Cantidades
        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadAgua = 1;

        // El cliente decidió agregar otro pastel 🧁
        cantidadPastel++; // Incrementamos en 1

        // Cálculo del total (con prioridad de operadores)
        double total = (precioCafe * cantidadCafe) + (precioPastel * cantidadPastel) + (precioAgua * cantidadAgua);

        // Descuento si el total supera $150
        boolean aplicaDescuento = total > 150;

        // Asignación del descuento (10%)
        double descuento = aplicaDescuento ? total * 0.10 : 0;

        // Cálculo final
        double totalFinal = total - descuento;

        // Salida formateada
        System.out.println("Total de la compra: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}