package br.com.consultorio.implementacao;

import br.com.consultorio.beans.Paciente;
import br.com.consultorio.util.EntradaTela;

public class ExecutaAgendaTela {

    public static void main(String[] args) {
        Paciente pac = new Paciente(EntradaTela.texto("Paciente CPF:"),
            EntradaTela.texto("Paciente NOME:"), EntradaTela.texto("Paciente FONE:"));

        EntradaTela.show(pac.getNome());
    }


}
