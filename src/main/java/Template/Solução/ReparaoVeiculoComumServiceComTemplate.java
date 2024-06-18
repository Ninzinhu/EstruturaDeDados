package Template.Solução;

import Template.VeiculoParaReparo;

public class ReparaoVeiculoComumServiceComTemplate extends ReparoVeiculoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaoVeiculoComumServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }


    @Override
    protected boolean veiculoParaReparo() {
        return false;
    }
}
