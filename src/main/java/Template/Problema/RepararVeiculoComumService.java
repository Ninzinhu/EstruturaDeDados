package Template.Problema;

import Template.VeiculoParaReparo;

public class RepararVeiculoComumService {

    private VeiculoParaReparo veiculoParaReparo;

    public RepararVeiculoComumService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
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
