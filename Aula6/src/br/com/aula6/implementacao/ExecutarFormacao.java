package br.com.aula6.implementacao;

import br.com.aula6.beans.Bacharelado;
import br.com.aula6.beans.Formacao;
import br.com.aula6.beans.Medio;

public class ExecutarFormacao {
    public static void main(String[] args) {

        //Formacao f = new Formacao("Matematico",360,5000,5);

        Medio m = new Medio("Ensio Medio",3,50,1,"obrigatorio");

        m.calcularMensalidade(0.1);
        System.out.println("Mensalidade Medio: " + m.getMensalidade());
        m.definirDuracao();
        System.out.println("Duração Medio : "+ m.getDuracao());

        Bacharelado b = new Bacharelado("Ensino Bacharelado",2,60,4,120,"JavaDEv");
        b.calcularMensalidade(0.2);
        System.out.println("Mensalidade Bacharelado: " + b.getMensalidade());
        b.definirDuracao();
        System.out.println("Duração Bacharelado:" + b.getDuracao());

    }
}
