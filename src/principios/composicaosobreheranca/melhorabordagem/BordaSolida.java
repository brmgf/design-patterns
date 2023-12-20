package principios.composicaosobreheranca.melhorabordagem;

public class BordaSolida extends Borda {

    public BordaSolida(Container container) {
        super(container);
    }

    @Override
    public void gerarBorda() {
        container.criarLayout();
        System.out.println("Gerando borda sólida...");
        container.fechar();
    }
}
