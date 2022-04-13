package implementacao;

import beans.Produto;

import javax.swing.*;

public class ExecutarProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Note Dell");
        p1.setValor(100);

        System.out.println(p1.getNome() + " - R$ " + p1.getValor());

        Produto p2 = new Produto("Impressora HP", 150);
        //p2.setNome("Impressora HP");
        //p2.setValor(150);

        System.out.println(p2.getNome() + " - R$ " + p2.getValor());

        Produto p3 = new Produto("Celular S10",1200,"Sansung");
        System.out.println(p3.getNome() + " - R$ " + p3.getValor() + " - " + p3.getMarca());

        JOptionPane.showMessageDialog(null,p3.detalhes());

        Produto p4 = new Produto("Tablet","Sansung",1500,false);
        //  ?? o que devo fazer com esses detalhes
        JOptionPane.showMessageDialog(null,p4.detalhes());


    }
}
