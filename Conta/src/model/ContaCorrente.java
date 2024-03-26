package model;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 1);
    }

    @Override
    public void atualiza(double taxaSelic) {
        double taxaP = (taxaSelic / 100);
        super.deposita((getSaldo() * taxaP) * 3);
    }
}