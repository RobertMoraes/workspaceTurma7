package br.com.consultorio.beans;

import java.util.Date;

public class Medico extends Funcionario{
    // atributos
    private String especialidade;
    private int crm;

    // construtor
    public Medico(){}

    public Medico(String cpf, String nome, String fone, Date dtadmissao, Date dtdemissao, double salario, String departamento, String especialidade, int crm) {
        super(cpf, nome, fone, dtadmissao, dtdemissao, salario, departamento);
        this.especialidade = especialidade;
        this.crm = crm;
    }
    //getters + setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
}
