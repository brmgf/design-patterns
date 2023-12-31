package principios.composicaosobreheranca.melhorabordagem;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Container {

    public abstract void adicionarComponente(Componente c);

    public abstract void removerComponente(Componente c);

    public abstract void criarLayout();

    public void fechar() {
        System.out.println("Fechando container...");
    }
}
