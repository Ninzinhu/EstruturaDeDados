package Template.Solução;

import Template.Problema.RepararVeiculoComumService;
import Template.Problema.RepararVeiculoDeLuxoService;
import Template.VeiculoParaReparo;

public class TesteRepararVeiculosTemplate {

    public static void main(String[] args) {
        System.out.println("-------------------LUXO---------------------");

        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparoVeiculoService rpl = new ReparoVeiculoDeLuxoServiceComTemplate(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("------------------COMUM---------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparoVeiculoComumServiceComTemplate(veiculoComum);

        rpc.reparaVeiculo();
    }
}
