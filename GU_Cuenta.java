
public class GU_Cuenta {
    float saldo;
    int numeroDepositos = 0;
    int numeroRetiros = 0;
    float tasaAnual;

    public GU_Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroDepositos++;
            System.out.println("Depósito exitoso." + cantidad);
        } else {
            System.out.println("Cantidad no válida.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
            System.out.println("Retiro realizado." + cantidad);
        } else {
            System.out.println("saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Su saldo actual es de: " + saldo);
    }
}
