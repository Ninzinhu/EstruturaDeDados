package FactoryMethod;

public class TesteProduto {


    public static void main(String[] args) {

        ProdutoFisico produtorFisico = new ProdutoFisico();
        produtorFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
