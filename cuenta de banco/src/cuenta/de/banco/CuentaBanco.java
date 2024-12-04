
package cuenta.de.banco;

class CuentaBanco {
    
    public String cliente;
    public int numeroCuenta;
    public String telefono;
    public final float limite = 9999; 
    private float saldo = 0; 
    private final float limite2 = 9999; 

    public CuentaBanco() {
        this.cliente = "";
        this.numeroCuenta = 0;
        this.telefono = "";
    }
    public void setDatosCuenta(String cliente, int numeroCuenta, String telefono) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.telefono = telefono;
    }

    // Metodos
    public float getSaldo() {
        return saldo; 
    }

    public void depositar(float monto) {
        if (monto > limite2) {
            System.out.println("No se pueden realizar depositos mayores a " + limite2);
        } else if (monto < 0) {
            System.out.println("El monto a depositar no puede ser negativo.");
        } else if (saldo + monto > limite) {
            System.out.println("El saldo no puede superar el limite de la cuenta.");
        } else {
            saldo += monto; 
            System.out.println("Deposito realizado correctamente.");
        }
    }

    public void retirar(float monto) {
        if (monto > limite2) {
            System.out.println("No se pueden realizar retiros mayores a " + limite2);
        } else if (monto < 0) {
            System.out.println("El monto a retirar no puede ser negativo.");
        } else if (saldo - monto < 0) {
            System.out.println("No se puede retirar. El saldo no puede quedar negativo.");
        } else {
            saldo -= monto; 
            System.out.println("Retiro realizado correctamente.");
        }
    }
}