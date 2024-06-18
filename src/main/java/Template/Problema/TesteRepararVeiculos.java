package Template.Problema;

import Template.VeiculoParaReparo;

public class TesteRepararVeiculos   {

    public static void main(String[] args) {
        System.out.println("-------------------LUXO---------------------");

        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        RepararVeiculoDeLuxoService rpl = new RepararVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("------------------COMUM---------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        RepararVeiculoComumService rpc = new RepararVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
