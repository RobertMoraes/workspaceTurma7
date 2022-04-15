package br.com.aula4.implementacao;

import br.com.aula4.beans.Banco;
import br.com.aula4.beans.Cliente;
import br.com.aula4.beans.ContaBancaria;

public class ExecutarContaBancaria {
    public static void main(String[] args) {
        //Dados FIXOS
        Banco bradesco = new Banco("Bradesco S/A",237);

        Cliente cli1 = new Cliente("Ana Maria Braga","1234567889","9898980000");

        // 1o. Conta
        ContaBancaria cc1 = new ContaBancaria(1010,10101,5000,"corrente",1000, cli1);

        // 2o. Conta
        ContaBancaria cc2 =new ContaBancaria(2020,20202,100,"poupança",0,cli1);

        System.out.println("Dados Bancario:");
        System.out.println(cc1.extrato());
        System.out.println(cc2.extrato());

        System.out.println("Conta2: Novo Limite - "+ cc2.definirLimite(10000));
        System.out.println("Deposito:" + cc2.deposito(0.1));
        System.out.println(cc2.extrato());

        // 3o. Conta
        ContaBancaria cc3 =new ContaBancaria(3030,30303,300,"poupança",0,cli1,bradesco);
        System.out.println(cc3.extrato());

        //  Entrada via Tela(swing) /Teclado (Scanner)

                Banco
                Cliente
                ContaBancaria

    }
}
