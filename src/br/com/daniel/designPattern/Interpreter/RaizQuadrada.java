package br.com.daniel.designPattern.Interpreter;

public class RaizQuadrada  implements Expressao {

        private Expressao unicoNumero;

        public RaizQuadrada (Expressao unicoNumero){
            this.unicoNumero = unicoNumero;
        }

        @Override
        public int avalia() {
            int avaliaResultadounicoNumero =  unicoNumero.avalia();


            return (int) Math.sqrt(avaliaResultadounicoNumero);
        }

    @Override
    public void aceita(Impressora visitor) {

    }
}


