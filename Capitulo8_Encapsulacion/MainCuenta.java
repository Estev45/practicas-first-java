
// Archivo: MainCuenta.java
public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000); // Intento de retiro mayor al saldo

        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
