package encapsularoquevaria.melhorabordagem;

public class JogadorFutebol extends Jogador {

    public JogadorFutebol(String nome, TipoCorrida tipoCorrida) {
        super(tipoCorrida, nome);
    }

    @Override
    public void definirTaticas() {
        System.out.println(nome + " defininindo ataque com o time...");
    }

}
