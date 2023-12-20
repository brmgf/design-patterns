package principios.encapsularoquevaria.contexto;

public class JogadorGolfe extends Jogador {

    public JogadorGolfe(String nome) {
        super(nome);
    }

    @Override
    public void definirTaticas() {
        System.out.println(nome + " não define tática com outros jogadores");
    }

    @Override
    public void correr() {
        System.out.println(nome + " não corre durante a partida");
    }
}
