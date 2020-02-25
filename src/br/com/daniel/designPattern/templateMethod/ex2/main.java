package br.com.daniel.designPattern.templateMethod.ex2;

import br.com.daniel.designPattern.templateMethod.ex2.Conta.Conta;
import br.com.daniel.designPattern.templateMethod.ex2.Relatorios.RelatorioComplexo;
import br.com.daniel.designPattern.templateMethod.ex2.Relatorios.RelatorioSimples;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.setAgencia(123);
        conta1.setEmail("conta1@gmail.com");
        conta1.setEndereco("Rua Pedro top");
        conta1.setNomeDoBanco("Santander");
        conta1.setNumeroConta(569);
        conta1.setSaldo(120);
        conta1.setTelefone("1199558844");
        conta1.setTitular("CharlesBronson");

        conta2.setAgencia(456);
        conta2.setEmail("conta2@gmail.com");
        conta2.setEndereco("Rua Joao Top");
        conta2.setNomeDoBanco("HSBC");
        conta2.setNumeroConta(1236);
        conta2.setSaldo(999);
        conta2.setTelefone("119999999");
        conta2.setTitular("Maoe Topinson");

        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(conta1);
        contas.add(conta2);


        RelatorioComplexo relatorioComplexo = new RelatorioComplexo();
        relatorioComplexo.gerarRelatorio(contas);

    }
}
