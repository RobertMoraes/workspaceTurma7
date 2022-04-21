package br.com.consultorio.beans;

import java.util.Date;

public class Gerente extends Funcionario{
    // atributo
    private String deptResponsavel;

    // construtor
    public Gerente(){}

    public Gerente(String cpf, String nome, String fone, Date dtadmissao, Date dtdemissao, double salario, String departamento, String deptResponsavel) {
        super(cpf, nome, fone, dtadmissao, dtdemissao, salario, departamento);
        this.deptResponsavel = deptResponsavel;
    }
    // getters + setters

    public String getDeptResponsavel() {
        return deptResponsavel;
    }

    public void setDeptResponsavel(String deptResponsavel) {
        this.deptResponsavel = deptResponsavel;
    }
}
