package br.com.consultorio.beans;

import java.util.Date;

public class Agendamento {
    // atributos
    private Paciente paciente;
    private Date dataHora;
    private Medico medico;
    private double valor;
    private Funcionario atendente;

    // construtor
    public Agendamento(){}

    public Agendamento(Paciente paciente, Date dataHora, Medico medico, double valor, Funcionario atendente) {
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.medico = medico;
        this.valor = valor;
        this.atendente = atendente;
    }
    // getters + setter

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }

    public String agendar(){
        return "Realizado com sucesso: " + this.dataHora;
    }

    public String consultaAgenda() {
        return "Agendamento{" +
                "paciente=" + paciente.getNome() +
                ", dataHora=" + dataHora +
                ", medico=" + medico.getNome() +
                ", valor=" + valor +
                ", atendente=" + atendente.getNome() +
                '}';
    }
}
