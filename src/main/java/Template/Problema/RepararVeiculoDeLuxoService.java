package Template.Problema;

import Template.VeiculoParaReparo;

public class RepararVeiculoDeLuxoService {

    public RepararVeiculoDeLuxoService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    private VeiculoParaReparo veiculoParaReparo;

    public void reparaVeiculo() {
        entradaOficina();
        analisarDanos();
        if (veiculoParaReparo()) {
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }

    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Notificando perda total para Seguradora");
    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Notificando reparo para Seguradora");

    }

    private void repararVeiculo() {
        System.out.println("Reparando Veiculo...");

    }

    private void analisarDanos() {
        System.out.println("Analisando Danos...");

    }

    private void entradaOficina() {
        System.out.println("Veiculo entrando Oficina...");


    }
}
