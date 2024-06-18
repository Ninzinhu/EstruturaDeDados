package Template.Solução;

import Template.VeiculoParaReparo;

public class ReparoVeiculoDeLuxoServiceComTemplate extends ReparoVeiculoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoDeLuxoServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }


    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
