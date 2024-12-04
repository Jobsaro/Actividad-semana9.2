
package cuenta.de.banco;

import java.util.Scanner;

import java.util.Scanner;

// Clase principal
public class CuentaDeBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CuentaBanco cuenta = new CuentaBanco();

        System.out.println("Bienvenido al sistema bancario.");
        System.out.println("Ingrese el numero de cuenta:");
        int numeroCuenta = entrada.nextInt();
        entrada.nextLine(); 
        System.out.println("Ingrese el nombre del cliente:");
        String cliente = entrada.nextLine();
        System.out.println("Ingrese el numero de telefono:");
        String telefono = entrada.nextLine();

        cuenta.setDatosCuenta(cliente, numeroCuenta, telefono);

        System.out.println("Cuenta verificada con exito.");

        while (true) {
            System.out.println("\n-----TRANSACCIONES-----");
            System.out.println("\nElige una opcion:");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.println("\nElige una opcion:");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto a depositar:");
                    float deposito = entrada.nextFloat();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar:");
                    float retiro = entrada.nextFloat();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.println("El saldo actual es: " + cuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema!");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}