package principios.interfacesobreimplementacao.contexto;

public class TesteConexao {

    public static void main(String[] args) {

        QuartoService quartoService = new QuartoService();
        quartoService.conectarBanco();

        ReservaService reservaService = new ReservaService();
        reservaService.conectarBanco();
    }

}
