public class Importado extends Produto {
    protected double imposto = 0.10f; 
    protected double taxa = 0.05f;
    protected double taxaImportacao;
    public Importado(String desc, double valor) {
        super(desc, valor);
        this.taxaImportacao = 0.05;
    }
    public Importado() {
        super();
        this.taxaImportacao = 0.05;
    }
    public double getTaxaImportacao() {
        return taxaImportacao;
    }
    @Override
    public double getValorTotal() {
        double vl = this.valor + (this.valor * this.imposto) + (this.valor * this.taxa) + (this.valor * this.taxaImportacao);
        vl = vl * 100;
        vl = Math.round(vl);
        vl = vl / 100;
        return vl;
    }
    @Override
    public String relatorio() {
        return String.format("Atributos {" +
                "descrição: nome do produto" +
                ",valor: valor do produto, Imposto: Imposto do produto, Taxa: Taxa do produto, Taxa de Importação: Taxa de Importação do produto}\n" +
                "Importado{" +
                "desc = '%s'" +
                ", valor: R$ %.2f" +
                ", imposto: %.2f" +
                ", taxa: %.2f" +
                ", taxaImportacao: %.2f" +
                ", Valor Total = R$ %.2f" +
                '}',
                getDesc(),
                getValor(),
                imposto,
                taxa,
                taxaImportacao,
                getValorTotal());
    }
}
