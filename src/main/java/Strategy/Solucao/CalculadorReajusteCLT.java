package Strategy.Solucao;

import Strategy.Funcionario;

import java.math.BigDecimal;

public class CalculadorReajusteCLT implements CalculadorReajusteAnunalSalario {


    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));

    }
}
