package principios.interfacesobreimplementacao.contexto;

public class ReservaService {

    ConexaoMySQL conexaoMySQL;

    public ReservaService() {
        this.conexaoMySQL = new ConexaoMySQL();
    }

    public void conectarBanco() {
        conexaoMySQL.connect();
        System.out.println("Serviço de reserva conectado ao banco");
    }
}
