package br.com.aula4.beans;

import java.util.Optional;

public class ContaBancaria {
    private Banco banco;
    private int agencia;
    private int numero;
    private double saldo;
    private double limiteCredito;
    private String tipo;
    private Cliente cliente;

    public ContaBancaria(){}

    public ContaBancaria(int agencia, int numero, double saldo, String tipo, double limiteCredito, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
        this.cliente = cliente;
        this.tipo = tipo;
    }
    public ContaBancaria(int agencia, int numero, double saldo, String tipo, double limiteCredito, Cliente cliente, Banco banco) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
        this.cliente = cliente;
        this.tipo = tipo;
        this.banco = banco;
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

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String saque(double valor){
        if ((saldo+limiteCredito) >= valor) {
            this.saldo = this.saldo - valor;
            return "Sucesso";
        }
        return "Saldo Insuficiente";
    }

    public String deposito(double valor){
        this.saldo = this.saldo + valor;
        return "Sucesso";
    }

    public String definirLimite(double valor){
        if (this.tipo.equals("corrente")){
            this.limiteCredito = valor;
            return "Sucesso";
        }
        return "Tipo de conta Invalida";
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
                ", limiteCredito=" + limiteCredito +
                ", tipo='" + tipo + '\'' +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
