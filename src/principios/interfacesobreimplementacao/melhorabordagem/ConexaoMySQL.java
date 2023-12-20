package principios.interfacesobreimplementacao.melhorabordagem;

public class ConexaoMySQL implements Conexao {

    public void conectar() {
        System.out.println("Conectando ao banco mysql...");
    }
}
