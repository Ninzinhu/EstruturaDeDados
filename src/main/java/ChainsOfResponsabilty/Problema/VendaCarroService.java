package ChainsOfResponsabilty.Problema;

import ChainsOfResponsabilty.Carro;
import ChainsOfResponsabilty.Marca;

import java.math.BigDecimal;

public class VendaCarroService {


    public BigDecimal calcularValorVenda(Carro carro){
        BigDecimal valorVenda = carro.getPreco();

        if(Marca.LAMBORGINI.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(1000)); // Desconto
        }

        if(Marca.PAGANI.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000)); // Desconto
        }

        if(carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){
            return valorVenda.subtract(new BigDecimal(10000));
        }
        return valorVenda;
    }
}
