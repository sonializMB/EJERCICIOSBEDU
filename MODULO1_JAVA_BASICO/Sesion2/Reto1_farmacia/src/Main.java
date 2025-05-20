import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Uso Scannner para obtener datos por teclado :)
        Scanner entrada = new Scanner(System.in);
        SimuladorFarmacia medicamento_01 = new SimuladorFarmacia();

        //Entrada de datos por teclado
        System.out.print("Nombre del medicamento: ");  //Nombre del medicamento
        medicamento_01.setMedic(entrada.nextLine());

        System.out.print("Precio unitario: ");         //Precio
        medicamento_01.setPrecio(entrada.nextDouble());

        System.out.print("Cantidad de piezas: ");       //Piezas
        medicamento_01.setPiezas(entrada.nextInt());

        entrada.close();   // Cerramos scanner 

        // Mostrar los datos
        System.out.println("\n \n °°°°°°°°° Datos del medicamento °°°°°°°°°");
        System.out.println("Nombre: " + medicamento_01.getMedic());
        System.out.println("Precio unitario: $" + medicamento_01.getPrecio());
        System.out.println("Cantidad: " + medicamento_01.getPiezas());
        System.out.println("Total sin descuento: $" + medicamento_01.Precio_Total());
        System.out.println("Total con descuento (si aplica): $" + medicamento_01.Descuento());
    }
}
