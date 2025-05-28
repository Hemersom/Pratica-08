class Peca {

    protected String nome;
    protected double custo;
    protected double lucro;

    public Peca() {
        this.nome = "";
        this.custo = 0.0;
        this.lucro = 0.0;
    }

    public Peca(String nome, double custo, double lucro) {
        this.nome = nome;
        this.custo = custo < 0 ? 0.0 : custo;
        this.lucro = lucro < 0 ? 0.0 : lucro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCusto(double custo) {
        this.custo = custo < 0 ? 0.0 : custo;
    }

    public double getCusto() {
        return custo;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro < 0 ? 0.0 : lucro;
    }

    public double getLucro() {
        return lucro;
    }

    public double calcularPreco() {
        return custo + lucro;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Lucro: " + lucro);
        System.out.println("Preço: " + calcularPreco());
    }
}
