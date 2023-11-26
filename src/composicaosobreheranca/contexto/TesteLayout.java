package composicaosobreheranca.contexto;

public class TesteLayout {

    public static void main(String[] args) {
        Container gridContainer = new GridContainer(2, 2);

        Componente g1 = new Componente("1");
        Componente g2 = new Componente("2");
        Componente g3 = new Componente("3");
        Componente g4 = new Componente("4");

        gridContainer.adicionarComponente(g1);
        gridContainer.adicionarComponente(g2);
        gridContainer.adicionarComponente(g3);
        gridContainer.adicionarComponente(g4);
        gridContainer.criarLayout();

        Container flowContainer = new FlowContainer();

        Componente f1 = new Componente("1");
        Componente f2 = new Componente("2");

        flowContainer.adicionarComponente(f1);
        flowContainer.adicionarComponente(f2);
        flowContainer.criarLayout();
    }

}
