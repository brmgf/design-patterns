package principios.composicaosobreheranca.melhorabordagem;

public class TesteLayout {

    public static void main(String[] args) {

        Componente g1 = new Componente("1");
        Componente g2 = new Componente("2");
        Componente g3 = new Componente("3");
        Componente g4 = new Componente("4");

        Container gridContainer = new GridContainer(2, 2);

        gridContainer.adicionarComponente(g1);
        gridContainer.adicionarComponente(g2);
        gridContainer.adicionarComponente(g3);
        gridContainer.adicionarComponente(g4);
        gridContainer.criarLayout();
        gridContainer.fechar();

        Borda gridContainerBordaSolida = new BordaSolida(gridContainer);
        gridContainerBordaSolida.gerarBorda();

        Borda gridContainerBordaTracejada = new BordaTracejada(gridContainer);
        gridContainerBordaTracejada.gerarBorda();

        Componente f1 = new Componente("1");
        Componente f2 = new Componente("2");

        Container flowContainer = new FlowContainer();

        flowContainer.adicionarComponente(f1);
        flowContainer.adicionarComponente(f2);
        flowContainer.criarLayout();
        flowContainer.fechar();

        Borda flowContainerBordaSolida = new BordaSolida(flowContainer);
        flowContainerBordaSolida.gerarBorda();

        Borda flowContainerBordaTracejada = new BordaTracejada(flowContainer);
        flowContainerBordaTracejada.gerarBorda();

    }

}
