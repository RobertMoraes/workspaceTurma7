package br.com.aula5.beans;

public abstract class ContaBancaria {
    private Banco banco;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(){}

    public ContaBancaria(Banco banco, int agencia, int numero, double saldo, Cliente cliente) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }


    public String saque(double valor){
        if ((saldo) >= valor) {
            this.saldo = this.saldo - valor;
            return "Sucesso";
        }
        return "Saldo Insuficiente";
    }

    public String deposito(double valor){
        this.saldo = this.saldo + valor;
        return "Sucesso";
    }

    public String extrato() {
        String valor="";
        if (this.banco != null)
            valor = String.valueOf(banco.getIdBancario());

        return "ContaBancaria{" +
                "banco = " + valor +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
