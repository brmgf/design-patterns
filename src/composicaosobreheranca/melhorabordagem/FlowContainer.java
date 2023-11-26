package composicaosobreheranca.melhorabordagem;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {

    private List<Componente> componentes;

    public FlowContainer() {
        this.componentes = new ArrayList<>();
    }

    @Override
    public void adicionarComponente(Componente c) {
        componentes.add(c);
    }

    @Override
    public void removerComponente(Componente c) {
        componentes.remove(c);
    }

    @Override
    public void criarLayout() {
        System.out.println("Criando layout Flow Container...");
        System.out.println(componentes);
    }
}
