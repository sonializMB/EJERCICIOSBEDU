import java.util.Scanner; //Importacion de la

public class CajeroAutomatico {
    public static void main(String[] args) {
        var saldo = 1000.0; // Saldo inicial
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° ");
            System.out.println("°°°°°°°°° Bienvenido al cajero automático °°°°°°°° "); //Menu del cajero
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");

            //Ingresar por teclado una opcion
            System.out.print("Ingresa la opcion que deseas realizar: ");
            opcion = scanner.nextInt();
            //the current time in milliseconds
            long start = System.currentTimeMillis();
            switch (opcion) {
                case 1 -> System.out.println("Tu saldo actual es: $" + saldo); //Consultar saldo
                case 2 -> {
                    System.out.print("¿Cuánto deseas depositar?: ");    //Depositar dinero
                    var deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Has depositado $" + deposito);
                    System.out.println("Tu saldo ahora es de $" + saldo);

                }
                case 3 -> {
                    System.out.print("¿Cuánto deseas retirar?: ");   //Retirar dinero
                    var retiro = scanner.nextDouble();
                    //Uso de un if-else en caso de que se retire mas de lo que hay
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Has retirado $" + retiro);
                        System.out.println("Tu saldo ahora es de $" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                }
                case 4 -> System.out.println("Haz salido de tu cajero, Vuelve pronto!!!");  //Salir
                default -> System.out.println("Haz ingresado una opción NO válida");
            }
        } while (opcion != 4);
        scanner.close();
    }
}