package implementacao;

import beans.ContaBancaria;

public class ExecutarConta {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaBancaria("1010",1000,"Fausto Silva","poupança");
        System.out.println("Tarefa Definir Limite: " +  cc.definirLimite(500));
        System.out.println(cc.extrato());

        ContaBancaria cc2 = new ContaBancaria("2020",2000,"Ana MAria Braga","corrente");
        System.out.println("Tarefa Definir Limite: " +  cc2.definirLimite(500));
        System.out.println(cc2.extrato());

    }

}
