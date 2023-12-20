package principios.encapsularoquevaria.melhorabordagem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Jogador {

    public TipoCorrida tipoCorrida;
    protected String nome;

    public void treinar() {
        System.out.println(nome + " em treino...");
    }

    public void competir() {
        System.out.println(nome + " em partida...");
    }

    public abstract void definirTaticas();

    public void correr() {
        tipoCorrida.correr();
    }

}
