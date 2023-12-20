package principios.composicaosobreheranca.melhorabordagem;

public abstract class Borda {

    protected Container container;

    public Borda(Container container) {
        this.container = container;
    }

    public abstract void gerarBorda();

}
