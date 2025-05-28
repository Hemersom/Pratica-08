public class ListaOrdenada extends Lista {

    public ListaOrdenada(int capacidade) {
        super(capacidade);
    }

    public ListaOrdenada() {
        super();
    }

    @Override
    public void insere(int valor) {
        if (tamanho < capacidade) {
            int i;
            for (i = tamanho - 1; (i >= 0 && lista[i] > valor); i--) {
                lista[i + 1] = lista[i];
            }
            lista[i + 1] = valor;
            tamanho++;
        } else {
            System.out.println("Lista cheia, não é possível inserir o valor: " + valor);
        }
    }
    @Override
    public void informarTamanho() {
        System.out.println("Tamanho atual da lista ordenada: " + tamanho);
    }
    @Override
    public void imprime() {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print("| "+lista[i] + " |-> ");
        }
        System.out.println("FIM\n");
    }

    @Override
    public int Busca(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida: " + posicao);
            return -1; 
        }
        return lista[posicao];
    }

    @Override
    public void remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida: " + posicao);
            return;
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            lista[i] = lista[i + 1];
        }
        tamanho--;
    }

}
