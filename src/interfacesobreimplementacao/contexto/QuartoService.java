package interfacesobreimplementacao.contexto;

public class QuartoService {

    ConexaoMySQL conexaoMySQL;

    public QuartoService() {
        this.conexaoMySQL = new ConexaoMySQL();
    }

    public void conectarBanco() {
        conexaoMySQL.connect();
        System.out.println("Serviço de quarto conectado ao banco");
    }
}
