package Ejercicios;

public class Ejercicio11 {

    public static void main(String[] args){

        CuentaCorriente cuenta1 = new CuentaCorriente(25000, "Nahum");
        CuentaCorriente cuenta2 = new CuentaCorriente(20000,"Nadia");

        System.out.println("numeroCuenta de cuenta1: "+cuenta1.getNumeroCuenta());
        System.out.println("numeroCuenta de cuenta2: "+cuenta2.getNumeroCuenta());
        System.out.println("Titular de cuenta1: "+cuenta1.getNombreTitular());
        System.out.println("Titular de cuenta2: "+cuenta2.getNombreTitular());
        System.out.println("Saldo de cuenta1: "+cuenta1.getSaldo());
        System.out.println("Saldo de cuenta2: "+cuenta2.getSaldo());
        cuenta1.transferencia(cuenta2,15000);
        cuenta1.transferencia(cuenta2,12000);
    }

    static class CuentaCorriente{

    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo,String nombreTitular) {
    this.saldo = saldo;
    this.nombreTitular = nombreTitular;
    double generador = Math.random()*99999;
    this.numeroCuenta = (long) generador;
    }

    public void ingresarSaldo(double monto){
        this.saldo += monto;
    }

    public void retirarSaldo(double monto){
        this.saldo -= monto;
    }

    public double getSaldo(){ return saldo; }

    public long getNumeroCuenta(){ return numeroCuenta; }

    public String getNombreTitular(){ return nombreTitular; }

    public void transferencia(CuentaCorriente cuenta,double monto){
    if(this.saldo>=monto){
        retirarSaldo(monto);
        cuenta.ingresarSaldo(monto);
        System.out.println("Transferencia exitosa");
        System.out.println("Saldo de "+getNombreTitular()+": "+getSaldo());
        System.out.println("Saldo de "+cuenta.getNombreTitular()+": "+cuenta.getSaldo());
        } else {
        System.out.println("No hay suficiente saldo para realizar la transferencia");
        System.out.println("Se intentó transferir: "+monto);
        System.out.println("Saldo de "+getNombreTitular()+": "+getSaldo());
    }
    }
    }

}
