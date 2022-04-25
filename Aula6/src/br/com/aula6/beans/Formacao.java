package br.com.aula6.beans;

import br.com.aula6.intefaces.FormacaoMetodos;

public abstract class Formacao implements FormacaoMetodos {
    private String descricao;
    private int duracao;
    private double mensalidade;
    private int periodo;

    public Formacao(){}

    public Formacao(String descricao, int duracao, double mensalidade, int periodo) {
        this.descricao = descricao;
        this.duracao = duracao;
        this.mensalidade = mensalidade;
        this.periodo = periodo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    // metodos

    public float retornaMedia(float ps1, float ps2){
        return (ps1 + ps2)/2;
    }

    public float retornaMedia(float ps1, float ps2,float nac1, float nac2){
        return ((ps1 + ps2)/2) + ((nac1+nac2)/2) * 1.05f ;
    }

    public float retornaMedia(float ps1, float ps2, float nac1, float nac2, float am1, float am2 ){
        return (ps1 + ps2 + nac1 + nac2 + am1 + am2)/6;
    }

    //Sem usar INTERFACTE preciso especificar que falta a implementação dos metodos
    /*
    public void definirDuracao(){
        System.out.println("Metodo definiDuração: não implementado");
    }

    public void calcularMensalidade(double fator){
        System.out.println("Metodo calcuarMensalidade: não implementado");
    }
    */
}
