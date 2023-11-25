package interfacesobreimplementacao.melhorabordagem;

public class TesteConexao {

    public static void main(String[] args) {

        QuartoService quartoService = new QuartoService(new ConexaoOracle());
        quartoService.conectarBanco();

        ReservaService reservaService = new ReservaService(new ConexaoOracle());
        reservaService.conectarBanco();
    }

}
