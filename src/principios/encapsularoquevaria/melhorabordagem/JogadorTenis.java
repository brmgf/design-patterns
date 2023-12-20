package principios.encapsularoquevaria.melhorabordagem;

public class JogadorTenis extends Jogador {

    public JogadorTenis(String nome, TipoCorrida tipoCorrida) {
        super(tipoCorrida, nome);
    }

    @Override
    public void definirTaticas() {
        System.out.println(nome + " defininindo tática com o treinador...");
    }

}
