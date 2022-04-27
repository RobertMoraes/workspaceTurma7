package br.com.aula8.implementacao;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class ExecutarControleAcessoSET {
    public static void main(String[] args) {
        Set<String> controleAcesso = new HashSet<String>();

        System.out.println("-- Iniciando Controle de Acesso");

        while (true) {
            String cracha = JOptionPane.showInputDialog("Leitor CRACHA:");

            if (!controleAcesso.contains(cracha)) {
                controleAcesso.add(cracha);
                JOptionPane.showMessageDialog(null, "Bem vindo! \n\t Acesso LIBERADO " + cracha);
            } else {
                controleAcesso.remove(cracha);
                JOptionPane.showMessageDialog(null, "Obrigado pela visita! " + cracha);
            }

            System.out.println(controleAcesso);
        }
    }
}
