package br.com.aula9.implementacao;

import br.com.aula9.beans.Login;

import javax.swing.*;

public class ExecutarLogin {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Usuario de Acesso:");
        String senha =  JOptionPane.showInputDialog("Senha de Acesso:");

        Login login = new Login();

        if (login.fazerLogin(usuario,senha)){
            JOptionPane.showMessageDialog(null,"Credenciais aceitas...");
        } else {
            JOptionPane.showMessageDialog(null,"Credenciais invalidas...");
        }

    }

}
