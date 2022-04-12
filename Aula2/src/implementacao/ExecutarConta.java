package implementacao;

import beans.ContaCorrente;

import java.util.Scanner;

public class ExecutarConta {
    public static void main(String[] args) {
        System.out.println("Iniciando....");

        ContaCorrente cc = new ContaCorrente();

        cc.setNumero(10101);
        cc.deposito(500);

        System.out.println("o Saldo é: " + cc.getSaldo());

        // usando Scanner
        Scanner leitor = new Scanner(System.in);

        cc.setNumero(leitor.nextInt());
        cc.setSaldo(leitor.nextDouble());

        System.out.println("o Saldo é: " + cc.getSaldo());

        System.out.println("Digite o valor de SAQUE");
        cc.saque(leitor.nextDouble());
        System.out.println("o Saldo é: " + cc.getSaldo());


    }
}
