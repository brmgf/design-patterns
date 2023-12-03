package encapsularoquevaria.contexto;

public class TesteJogo {

    public static void main(String[] args) {
        JogadorTenis jogadorTenis = new JogadorTenis("Guga");
        jogadorTenis.treinar();
        jogadorTenis.correr();
        jogadorTenis.definirTaticas();
        jogadorTenis.competir();

        JogadorFutebol jogadorFutebol = new JogadorFutebol("Ronaldo");
        jogadorFutebol.treinar();
        jogadorFutebol.correr();
        jogadorFutebol.definirTaticas();
        jogadorFutebol.competir();

        JogadorGolfe jogadorGolfe = new JogadorGolfe("Anthony");
        jogadorGolfe.treinar();
        jogadorGolfe.correr();
        jogadorGolfe.definirTaticas();
        jogadorGolfe.competir();
    }
}
