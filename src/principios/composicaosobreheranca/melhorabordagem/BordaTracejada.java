package principios.composicaosobreheranca.melhorabordagem;

public class BordaTracejada extends Borda {

    public BordaTracejada(Container container) {
        super(container);
    }

    @Override
    public void gerarBorda() {
        container.criarLayout();
        System.out.println("Gerando borda tracejada...");
        container.fechar();
    }
}
