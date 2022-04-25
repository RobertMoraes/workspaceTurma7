package br.com.consultorio.beans;

import java.util.Date;

public class Funcionario extends Pessoa{

    // atributos
    private Date dtadmissao;
    private Date dtdemissao;
    private double salario;
    private String departamento;

    // construtor

    public Funcionario(){}
    public Funcionario(String cpf, String nome, String fone, Date dtadmissao, Date dtdemissao, double salario, String departamento) {
        super(cpf, nome, fone);
        this.dtadmissao = dtadmissao;
        this.dtdemissao = dtdemissao;
        this.salario = salario;
        this.departamento = departamento;
    }

    // getters + setters
    public Date getDtadmissao() {
        return dtadmissao;
    }

    public void setDtadmissao(Date dtadmissao) {
        this.dtadmissao = dtadmissao;
    }

    public Date getDtdemissao() {
        return dtdemissao;
    }

    public void setDtdemissao(Date dtdemissao) {
        this.dtdemissao = dtdemissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
