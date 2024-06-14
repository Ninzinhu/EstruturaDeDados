package FactoryMethod.solucao;

import FactoryMethod.Produto;
import FactoryMethod.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {

    public static void main(String[] args) throws IllegalAccessException {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoFisico, produtoDigital);
        System.out.println(produtoDigital);
    }
}
