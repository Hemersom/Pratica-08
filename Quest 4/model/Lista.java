public class Lista {
    protected int capacidade;
    protected int tamanho;
    protected  int[] lista;

    public Lista(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.lista = new int[capacidade];
    }
    public Lista(){
        
    }
    public int getCapacidade() {
        return capacidade;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        this.lista = new int[capacidade];
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int Busca(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida: " + posicao);
            return -1; 
        }
        return lista[posicao];
    }

    public void insere(int valor) {
        if (tamanho < capacidade) {
            lista[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista cheia, não é possível inserir o valor: " + valor);
        }
    }
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
    public void informarTamanho() {
        System.out.println("Tamanho atual da lista: " + tamanho);
    }
    public void imprime() {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.print("Lista: \n");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("| "+lista[i] + " |->");
        }
        System.out.print("FIM");
        System.out.println();
    }

}
