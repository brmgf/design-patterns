package composicaosobreheranca.melhorabordagem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Componente {

    private String nome;

    public Componente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
