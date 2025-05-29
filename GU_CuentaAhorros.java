
public class GU_CuentaAhorros extends GU_Cuenta {
    private boolean activa;

    public GU_CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = saldo >= 10;
        if (activa) {
            System.out.println("Cuenta de ahorros.");
        } else {
            System.out.println("Saldo insuficiente para la cuenta de ahorros.");
        }
    }

    @Override
    public void depositar(float cantidad) {
        if (activa) {
            super.depositar(cantidad);
        } else {
            System.out.println("Cuenta inactiva.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. No se puede realizar el retiro.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }
}
