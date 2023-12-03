package encapsularoquevaria.melhorabordagem;

public class JogadorGolfe extends Jogador {

    public JogadorGolfe(String nome, TipoCorrida tipoCorrida) {
        super(tipoCorrida, nome);
    }

    @Override
    public void definirTaticas() {
        System.out.println(nome + " não define tática com outros jogadores");
    }

}
