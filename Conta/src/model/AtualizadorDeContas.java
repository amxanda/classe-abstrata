package model;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("Saldo anterior da conta: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo atualizado da conta: " + c.getSaldo() + "\n");
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}