package principios.composicaosobreheranca.contexto;

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

        Container gridContainerBordaSolida = new GridContainerBordaSolida(2, 2);

        gridContainerBordaSolida.adicionarComponente(g1);
        gridContainerBordaSolida.adicionarComponente(g2);
        gridContainerBordaSolida.adicionarComponente(g3);
        gridContainerBordaSolida.adicionarComponente(g4);
        gridContainerBordaSolida.criarLayout();

        Container gridContainerBordaTracejada = new GridContainerBordaTracejada(2, 2);

        gridContainerBordaTracejada.adicionarComponente(g1);
        gridContainerBordaTracejada.adicionarComponente(g2);
        gridContainerBordaTracejada.adicionarComponente(g3);
        gridContainerBordaTracejada.adicionarComponente(g4);
        gridContainerBordaTracejada.criarLayout();

        Componente f1 = new Componente("1");
        Componente f2 = new Componente("2");

        Container flowContainer = new FlowContainer();

        flowContainer.adicionarComponente(f1);
        flowContainer.adicionarComponente(f2);
        flowContainer.criarLayout();

        Container flowContainerBordaSolida = new FlowContainerBordaSolida();

        flowContainerBordaSolida.adicionarComponente(f1);
        flowContainerBordaSolida.adicionarComponente(f2);
        flowContainerBordaSolida.criarLayout();

        Container flowContainerBordaTracejada = new FlowContainerBordaTracejada();

        flowContainerBordaTracejada.adicionarComponente(f1);
        flowContainerBordaTracejada.adicionarComponente(f2);
        flowContainerBordaTracejada.criarLayout();

    }

}
