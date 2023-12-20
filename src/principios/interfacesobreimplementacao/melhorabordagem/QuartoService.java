package principios.interfacesobreimplementacao.melhorabordagem;

public class QuartoService {

    Conexao conexao;

    public QuartoService(Conexao conexao) {
        this.conexao = conexao;
    }

    public void conectarBanco() {
        conexao.conectar();
        System.out.println("Serviço de quarto conectado ao banco");
    }
}
