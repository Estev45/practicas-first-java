
// Archivo: CuentaBancaria.java
public class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter para titular
    public String getTitular() {
        return titular;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}
