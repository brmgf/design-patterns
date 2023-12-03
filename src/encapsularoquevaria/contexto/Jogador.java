package encapsularoquevaria.contexto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Jogador {

    protected String nome;

    public void treinar() {
        System.out.println(nome + " em treino...");
    }

    public void competir() {
        System.out.println(nome + " em partida...");
    }

    public abstract void definirTaticas();

    public abstract void correr();
}
