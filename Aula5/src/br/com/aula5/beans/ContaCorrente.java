package br.com.aula5.beans;

public class ContaCorrente extends ContaBancaria{
    private double limiteCredito;
    private double taxa;

    public ContaCorrente(){}

    public ContaCorrente(Banco banco, int agencia, int numero, double saldo, Cliente cliente, double limiteCredito, double taxa) {
        super(banco, agencia, numero, saldo, cliente);
        this.limiteCredito = limiteCredito;
        this.taxa = taxa;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String definirLimite(double valor){
        this.limiteCredito = valor;
        return "Sucesso";
    }

    @Override
    public String extrato() {
        return super.extrato() + "contaCorrente{ limiteCredito = " + this.limiteCredito + ", taxa = " + this.taxa;
    }

    @Override
    public String saque(double valor) {
            if ((getSaldo() + limiteCredito) >= valor) {
                setSaldo(getSaldo() - valor);
                return "Sucesso";
            }
            return "Saldo Insuficiente";
    }
}
