package ChainsOfResponsabilty.Problema;

import ChainsOfResponsabilty.Carro;
import ChainsOfResponsabilty.Marca;

import java.math.BigDecimal;

public class TesteVendaCarro {

    public static void main(String[] args) {
        VendaCarroService vendaCarroService = new VendaCarroService();


        Carro carro1 = new Carro();
        carro1.setMarca(Marca.PORSHE);
        carro1.setModelo("911r");
        carro1.setPreco(new BigDecimal(100000.00));

        BigDecimal valorVenda1 = vendaCarroService.calcularValorVenda(carro1);
        System.out.println("Valor de venda do Porshe 911r: " +carro1.getPreco());
        System.out.println("Valor de venda do Porshe 911r com desconto: " +valorVenda1);

        Carro carro2 = new Carro();
        carro1.setMarca(Marca.PAGANI);
        carro1.setModelo("Chiron");
        carro1.setPreco(new BigDecimal(150000.00));

        BigDecimal valorVenda2 = vendaCarroService.calcularValorVenda(carro2);
        System.out.println("Valor de venda do Pagani Chiron: " +carro2.getPreco());
        System.out.println("Valor de venda do Pagani Chiron com desconto: " +valorVenda2);

        Carro carro3 = new Carro();
        carro1.setMarca(Marca.LAMBORGINI);
        carro1.setModelo("Veneno");
        carro1.setPreco(new BigDecimal(300000.00));

        BigDecimal valorVenda3 = vendaCarroService.calcularValorVenda(carro3);
        System.out.println("Valor de venda do Lamborgini Veneno: " +carro2.getPreco());
        System.out.println("Valor de venda do Lamborgini Veneno com desconto: " +valorVenda3);






    }
}
