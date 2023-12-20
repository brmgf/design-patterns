package principios.interfacesobreimplementacao.melhorabordagem;

public class ReservaService {

    Conexao conexao;

    public ReservaService(Conexao conexao) {
        this.conexao = conexao;
    }

    public void conectarBanco() {
        conexao.conectar();
        System.out.println("Serviço de reserva conectado ao banco");
    }
}
