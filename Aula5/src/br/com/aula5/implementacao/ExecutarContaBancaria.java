package br.com.aula5.implementacao;

import br.com.aula5.beans.*;

public class ExecutarContaBancaria {
    public static void main(String[] args) {

        Banco bb = new Banco("Itau",341);
        Cliente cli = new Cliente("Fausto Silva","123456789","55119898989800");

        /*
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setBanco(bb);
        contaBancaria.setCliente(cli);
        contaBancaria.setSaldo(1000000);
        */

        ContaCorrente cc = new ContaCorrente(bb,1010,10101,600,cli,0,10);

        System.out.println(cc.extrato());
        System.out.println("Novo limite:" + cc.definirLimite(1000));
        System.out.println(cc.extrato());

        Poupanca pp = new Poupanca(bb,1010,10102,100,cli,0);
        pp.setRendimento(10);
        System.out.println(pp.extrato());
        System.out.println("Creditar rendimento:" + pp.creditarRendimento());
        System.out.println(pp.extrato());

        // Saque de valores

        System.out.println("SAQUE Poupança( 1.000) :" + pp.saque(1000));
        System.out.println("SAQUE CC ( 1.000) : " + cc.saque(1000));
        System.out.println("CC: " + cc.getSaldo() + " / " + cc.getLimiteCredito());

        // operações com o ContaBancaria
        //System.out.println("ContaBancaria:" + contaBancaria.extrato());
    }

}
