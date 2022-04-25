package br.com.consultorio.implementacao;

import br.com.consultorio.beans.Agendamento;
import br.com.consultorio.beans.Funcionario;
import br.com.consultorio.beans.Medico;
import br.com.consultorio.beans.Paciente;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExecutaAgenda {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat formatDateTime = new SimpleDateFormat("yyyy/MM/dd hh:mm");

        Paciente paciente = new Paciente("123465798","Fausto Silva","1198989800");

        Funcionario func = new Funcionario("987654321","Ana Maria Braga","1578780000",formatDate.parse("2021/01/01"),null,1500,"ADM");

        Medico med = new Medico("1237894536","Dr. Arnaldo","1234536777",formatDate.parse("2020/01/01"),null,5000,"MEDICO","Clinico Geral",12345);

        Agendamento agenda = new Agendamento(paciente,formatDateTime.parse("2022/04/20 22:00"),med,450,func);

        System.out.println(agenda.consultaAgenda());
    }
}
