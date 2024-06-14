package FactoryMethod.solucao;

import FactoryMethod.*;

import java.math.BigDecimal;

public class ProdutoFactory {


    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) throws IllegalAccessException {
        switch (tipoProdutoEnum){
            case FISICO :
                ProdutoFisico produtorFisico = new ProdutoFisico();
                produtorFisico.setPossuiDimensoesFisicas(true);
                return  produtorFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return  produtoDigital;

            case TOYS:
                TOYS brinquedos = new TOYS();
                brinquedos.setPossuiDimensoesFisicas(true);
                brinquedos.setPreco(BigDecimal.valueOf(99.99));
                return brinquedos;


            default:
                throw  new IllegalAccessException("Tipo de Produto não disponivel");
        }
    }
}
