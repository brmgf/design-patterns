package encapsularoquevaria.melhorabordagem;

public class TesteJogo {

    public static void main(String[] args) {
        JogadorTenis jogadorTenis = new JogadorTenis("Guga", new CorrerRapido());
        jogadorTenis.treinar();
        jogadorTenis.definirTaticas();
        jogadorTenis.correr();
        jogadorTenis.competir();

        JogadorFutebol jogadorFutebol = new JogadorFutebol("Ronaldo", new CorrerRapido());
        jogadorFutebol.treinar();
        jogadorFutebol.definirTaticas();
        jogadorFutebol.correr();
        jogadorFutebol.competir();

        JogadorGolfe jogadorGolfe = new JogadorGolfe("Anthony", new NaoCorrer());
        jogadorGolfe.treinar();
        jogadorGolfe.definirTaticas();
        jogadorGolfe.correr();
        jogadorGolfe.competir();
    }
}
