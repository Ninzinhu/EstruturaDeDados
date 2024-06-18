package Template.Solução;

import Template.VeiculoParaReparo;

public class ReparoVeiculoComumServiceComTemplate extends ReparoVeiculoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoComumServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }


    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
