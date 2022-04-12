package beans;

public class ContaCorrente {
    // atributos
    private double saldo;
    private int numero;

    // getter + setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // metodos
    public void deposito(double valor){
        this.saldo = this.saldo + valor;
        extrato();
    }

    public void saque(double valor){
        this.saldo = this.saldo - valor;
        extrato();
    }

    public void extrato(){
        System.out.println("Extrato...|| Numero:" + this.numero + "   Saldo: " + this.saldo);
    }
}
