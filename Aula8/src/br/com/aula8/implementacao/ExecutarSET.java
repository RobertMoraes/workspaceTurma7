package br.com.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSET {
    public static void main(String[] args) {
        Set<String> h_set = new HashSet<String>();

        // Adicionar

        h_set.add("azul");
        h_set.add("vermelho");

        System.out.println(h_set.add("preto"));
        System.out.println(h_set.add("preto"));

        // listar
        System.out.println(h_set);

        for (String item : h_set){
            System.out.println("conteudo: " + item);
        }

        // tem conteudo?
        System.out.println("Esta vazio: " + h_set.isEmpty());

        // procurar informação

        System.out.println("Tem a cor azul ? " + h_set.contains("azul"));
        System.out.println("Tem a cor verde ? " + h_set.contains("verde"));

        // remover

        System.out.println("remover verde:" + h_set.remove("verde"));
        System.out.println("remover azul:" +h_set.remove("azul"));

        System.out.println(h_set);
    }
}
