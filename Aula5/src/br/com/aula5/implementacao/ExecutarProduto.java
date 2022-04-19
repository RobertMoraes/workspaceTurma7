package br.com.aula5.implementacao;

import br.com.aula5.beans.Celular;
import br.com.aula5.beans.Livro;
import br.com.aula5.beans.Produto;

public class ExecutarProduto {
    public static void main(String[] args) {
        /*
        Produto p1 = new Produto();

        p1.setCodigo(10);
        p1.setDescricao("Aprendendo Java");
        p1.setAutor("Fiap School");

        System.out.println("Produto:" + p1.getAutor() + p1.getIsbn() + p1.getDescricao());
        */


        Produto p2 = new Produto(20,100,"Mouse com Fio");
        Livro l2 = new Livro(21,50,"Aprendendo Java","12346","Fiap School");
        Celular c2 = new Celular(22,1500,"Sansung S10",25,128);
        System.out.println(p2.detalhes());
        System.out.println(l2.detalhes());

        // Usando do metodo da classe pai..!!
        System.out.println(c2.detalhes());

        p2.calcularImposto(1.10);
        l2.calcularImposto(1.20);
        c2.calcularImposto(1.30);
    }
}
