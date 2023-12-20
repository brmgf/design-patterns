package principios.encapsularoquevaria.contexto;

public class JogadorFutebol extends Jogador {

    public JogadorFutebol(String nome) {
        super(nome);
    }

    @Override
    public void definirTaticas() {
        System.out.println(nome + " defininindo ataque com o time...");
    }

    @Override
    public void correr() {
        System.out.println(nome + " correndo pelo campo...");
    }
}
