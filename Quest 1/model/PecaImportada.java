class PecaImportada extends Peca {
    protected double taxaImportacao;
    protected double taxaFrete;
    
    public PecaImportada() {
        super();
        this.taxaImportacao = 0.0;
        this.taxaFrete = 0.0;
    }
    public PecaImportada(String nome, double custo, double lucro, double taxaImportacao, double taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao < 0 ? 0.0 : taxaImportacao;
        this.taxaFrete = taxaFrete < 0 ? 0.0 : taxaFrete;
    }
    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao < 0 ? 0.0 : taxaImportacao;
    }
    public double getTaxaImportacao() {
        return taxaImportacao;
    }
    public void setTaxaFrete(double taxaFrete) {
        this.taxaFrete = taxaFrete < 0 ? 0.0 : taxaFrete;
    }
    public double getTaxaFrete() {
        return taxaFrete;
    }
    @Override
    public double calcularPreco() {
        return super.calcularPreco() + taxaImportacao + taxaFrete;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Taxa de Importação: " + taxaImportacao);
        System.out.println("Taxa de Frete: " + taxaFrete);
        System.out.println("Preço Final: " + calcularPreco());
    }
}
