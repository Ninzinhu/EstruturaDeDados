package FactoryMethod.solucao;

import FactoryMethod.Produto;
import FactoryMethod.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {

    public static void main(String[] args) throws IllegalAccessException {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        Produto brinquedos = ProdutoFactory.getInstance(TipoProdutoEnum.TOYS);

        System.out.println(produtoFisico);
        System.out.println(produtoDigital);
        System.out.println(brinquedos);
    }
}
