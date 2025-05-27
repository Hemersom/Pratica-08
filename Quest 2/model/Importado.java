public class Importado extends Nacional {
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
    public String toString() {
        return "Importado{" +
                "desc='" + desc + '\'' +
                ", valor=" + valor +
                ", imposto=" + imposto +
                ", taxa=" + taxa +
                ", taxaImportacao=" + taxaImportacao +
                ", Valor Total=" + (valor + valor * imposto + valor * taxa + valor * taxaImportacao) +
                '}';
    }
}
