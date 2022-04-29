package br.com.aula9.beans;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String saque(double valor){
        //regra de negocio
        return "saque";
    }

    public void deposito(double valor) throws Exception {
        // regra de negocio
        if (valor > 1000) {
            throw new Exception("Valor não permitido para essa operação");
        }
        this.saldo = this.saldo + valor;
    }

}
