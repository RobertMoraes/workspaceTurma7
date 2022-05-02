package br.com.aula9.implementacao;

import br.com.aula9.beans.ContaBancaria;

import javax.swing.*;

public class ExecutarContaCorrente {
    public static void main(String[] args) {

        ContaBancaria cc = new ContaBancaria(5000);

        try {
            //obter os dados cliente + banco

            System.out.println("Saldo : " + cc.getSaldo());

            cc.deposito(1500);

            System.out.println("Saldo : " + cc.getSaldo());
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }

}
