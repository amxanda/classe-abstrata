package model;

public abstract class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void atualiza(double taxaSelic);

    public void deposita(double valor) {
        saldo += valor;
    }
}