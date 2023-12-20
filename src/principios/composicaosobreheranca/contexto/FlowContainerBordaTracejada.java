package principios.composicaosobreheranca.contexto;

import java.util.ArrayList;
import java.util.List;

public class FlowContainerBordaTracejada extends Container {

    private List<Componente> componentes;

    public FlowContainerBordaTracejada() {
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
        System.out.println("Criando layout Flow Container com borda tracejada...");
        System.out.println(componentes);
        this.fechar();
    }
}
