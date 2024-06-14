package FactoryMethod.solucao;

import FactoryMethod.Produto;
import FactoryMethod.ProdutoDigital;
import FactoryMethod.ProdutorFisico;
import FactoryMethod.TipoProdutoEnum;

public class ProdutoFactory {


    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) throws IllegalAccessException {
        switch (tipoProdutoEnum){
            case FISICO :
                ProdutorFisico produtorFisico = new ProdutorFisico();
                produtorFisico.setPossuiDimensoesFisicas(true);
                return  produtorFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return  produtoDigital;

            default:
                throw  new IllegalAccessException("Tipo de Produto não disponivel");
        }
    }
}
