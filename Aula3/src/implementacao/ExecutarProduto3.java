package implementacao;

import beans.Produto;
import util.EntradaTela;

public class ExecutarProduto3 {
    public static void main(String[] args) {
        Produto p1 = new Produto(EntradaTela.texto("Informe o Produto"),
                                 EntradaTela.texto("Informe a marca:"),
                                 EntradaTela.decimal("Digite o Valor:"),
                                 EntradaTela.logico("Esta em promoção?"));

        EntradaTela.show(p1.detalhes());

    }
}
