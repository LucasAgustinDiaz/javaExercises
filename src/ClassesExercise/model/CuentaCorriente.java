package ClassesExercise.model;

public class CuentaCorriente {

    // Attributes
    private double saldo;
    private String titular;
    private String moneda;

    // Constructor/s
    public CuentaCorriente() {
    }

    public CuentaCorriente(CuentaCorriente c) {
        this.saldo = c.getSaldo();
        this.titular = c.getTitular();
        this.moneda = c.getMoneda();
    }

    public CuentaCorriente(double monto, String titular, String moneda) {
        this.saldo = monto;
        this.titular = titular;
        this.moneda = moneda;
    }

    // Methods
    // set +mount of money from the account
    public void ingreso(double monto){
        this.saldo += monto;
    }

    // get -mount of money from the account
    public void egreso(double monto) {
        this.saldo -= monto;
    }

    // transfer mount of money to another account
    public void transferencia(double monto, CuentaCorriente c) {
        egreso(monto);
        c.ingreso(monto);
    }

    // transfer mount of money again to the account
    public void reintegro(double monto){ ingreso(monto);}

    // getters and setters
    // get the current mount of money in the account
    public Double getSaldo() {
        return saldo;
    }

    // set the total mount of money in the account
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Saldo cuenta: " + moneda + saldo + " | Titular: " + titular;
    }
}
