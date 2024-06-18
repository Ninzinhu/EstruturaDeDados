package Strategy.Solucao;

import Strategy.Funcionario;
import Strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteSalarioComStrategy {

    public void calculeReajusteAnual(Funcionario funcionario, CalculadorReajusteAnunalSalario calculadorReajusteAnunalSalario) {
        calculadorReajusteAnunalSalario(funcionario);
    }

    private void calculadorReajusteAnunalSalario(Funcionario funcionario) {
    }

     if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
    } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
    } else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));

    }
}
