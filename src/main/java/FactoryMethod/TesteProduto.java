package FactoryMethod;

public class TesteProduto {


    public static void main(String[] args) {

        ProdutorFisico produtorFisico = new ProdutorFisico();
        produtorFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
