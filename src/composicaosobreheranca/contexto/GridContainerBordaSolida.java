package composicaosobreheranca.contexto;

import java.util.Arrays;

public class GridContainerBordaSolida extends Container {

    private Componente[][] componentes;
    private int contadorLinha;
    private int contadorColuna;
    private int largura;
    private int altura;

    public GridContainerBordaSolida(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        componentes = new Componente[largura][altura];
    }

    @Override
    public void adicionarComponente(Componente c) {
        if (contadorLinha == altura && contadorColuna == largura) {
            System.out.println("Não é possível adicionar outro elemento");
        } else {
            componentes[contadorLinha][contadorColuna] = c;
            contadorColuna++;
            if (contadorColuna == largura) {
                contadorLinha++;
                if (contadorLinha < altura) {
                    contadorColuna = 0;
                }
            }
        }
    }

    @Override
    public void removerComponente(Componente c) {
        for (int i = 0; i < componentes.length; i++) {
            for (int j = 0; j < componentes[i].length; j++) {
                if (componentes[i][j] == c) {
                    componentes[i][j] = null;
                }
            }
        }
    }

    @Override
    public void criarLayout() {
        System.out.println("Criando layout Grid Container com borda sólida...");
        System.out.println(Arrays.deepToString(componentes));
        this.fechar();
    }
}
