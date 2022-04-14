package beans;

public class ContaBancaria {
    private String numero;
    private double saldo;
    private String cliente;
    private double limiteEspecial;
    private String tipo;

    // construtores
    public ContaBancaria(){}

    public ContaBancaria(String numero, double saldo, String cliente, String tipo) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public ContaBancaria(String numero, double saldo, String cliente, double limiteEspecial, String tipo) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.limiteEspecial = limiteEspecial;
        this.tipo = tipo;
    }

    // get + set
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodos (Operações)

    public String definirLimite(double valor){
        if (this.tipo.equals("corrente")){
            this.limiteEspecial = valor;
            return "Sucesso";
        }
        return "Tipo de conta Invalida";
    }

    public String extrato(){
        return "ContaBancaria{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", cliente='" + cliente + '\'' +
                ", limiteEspecial=" + limiteEspecial +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
