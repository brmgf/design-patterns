package encapsularoquevaria.contexto;

public class JogadorTenis extends Jogador {

    public JogadorTenis(String nome) {
        super(nome);
    }

    @Override
    public void definirTaticas() {
        System.out.println(nome + " defininindo tática com o treinador...");
    }

    @Override
    public void correr() {
        System.out.println(nome + " correndo pela quadra...");
    }
}
