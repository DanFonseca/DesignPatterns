package br.com.daniel.designPattern.State.ex1;

import br.com.daniel.designPattern.State.ex1.Interface.Estado;

public class EmAprovacao  implements Estado {

    boolean descontoAplicado = false;

    @Override
    public double calcular(Orcamento orcamento) {

        if(!descontoAplicado){
            descontoAplicado = true;
            return orcamento.getValor() * 0.5;
        }else{
            throw new RuntimeException("Desconto só pode ser Aplicado uma vez");
        }

    }

    @Override
    public void aprovado(Orcamento orcamento) {
       orcamento.estado = new Aprovado();
    }


    @Override
    public void emAprovacao(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Em Aprovação. Pois está Em Aprovação");
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Finalizado. Pois está Em Aprovação");
    }

    @Override
    public  void reprovado(Orcamento orcamento) {
        orcamento.reprovado();
    }

    public String toString (){
        return "Em aprovaçao";
    }
}
