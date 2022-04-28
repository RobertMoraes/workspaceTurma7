package br.com.aula8.implementacao;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class ExecutarControleAcessoSET {
    public static void main(String[] args) {
        Set<String> controleAcesso = new HashSet<String>();

        System.out.println("-- Iniciando Controle de Acesso");

        while (true) {
            String tipo = JOptionPane.showInputDialog("Digite <E>ntrada ou <S>aida");

            if (tipo.equalsIgnoreCase("E") || tipo.equalsIgnoreCase("S") ) {

                if (tipo.equalsIgnoreCase("E")) {
                    String cracha = JOptionPane.showInputDialog("Leitor CRACHA:");
                    if (!controleAcesso.contains(cracha)) {
                        controleAcesso.add(cracha);
                        JOptionPane.showMessageDialog(null, "Bem vindo! \n\t Acesso LIBERADO " + cracha);
                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada já registrada para esse cracha:" + cracha);
                    }
                }

                if (tipo.equalsIgnoreCase("S")) {
                    String cracha = JOptionPane.showInputDialog("Leitor CRACHA:");
                    if (controleAcesso.contains(cracha)) {
                        controleAcesso.remove(cracha);
                        JOptionPane.showMessageDialog(null, "Obrigado pela visita! " + cracha);
                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada NÂO registrada para esse cracha:" + cracha);
                    }
                }
                System.out.println(controleAcesso);
            } else {
                JOptionPane.showMessageDialog(null,"Valor invalido..!!");
            }
        }
    }
}
