package br.com.aula5.beans;

public class Poupanca extends ContaBancaria{
    private double rendimento;

    public Poupanca(){}

    public Poupanca(Banco banco, int agencia, int numero, double saldo, Cliente cliente, double rendimento) {
        super(banco, agencia, numero, saldo, cliente);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String creditarRendimento(){
        double valor = ((rendimento/100) * getSaldo()) + getSaldo();
        setSaldo(valor);
        return "Sucesso";
    }
}
