
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GU_CuentaAhorros cuenta = null;

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Cuenta de ahorros");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar saldo");
            System.out.println("5. Mostrar estado de la cuenta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese saldo inicial: ");
                    float saldoInicial = scanner.nextFloat();
                    System.out.print("Ingrese tasa anual: ");
                    float tasa = scanner.nextFloat();
                    cuenta = new GU_CuentaAhorros(saldoInicial, tasa);
                    break;
                case 2:
                    if (cuenta != null) {
                        System.out.print("Ingrese cantidad a depositar: ");
                        float deposito = scanner.nextFloat();
                        cuenta.depositar(deposito);
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 3:
                    if (cuenta != null) {
                        System.out.print("Ingrese cantidad a retirar: ");
                        float retiro = scanner.nextFloat();
                        cuenta.retirar(retiro);
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 4:
                    if (cuenta != null) {
                        cuenta.mostrarSaldo();
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 5:
                    if (cuenta != null) {
                        cuenta.mostrarEstado();
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;


            }
        }
    }
}
