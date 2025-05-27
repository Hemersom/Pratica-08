public class Nacional extends Produto {
    protected double imposto = 0.10f; 
    protected double taxa;
    public Nacional(String desc, double valor) {
        super(desc, valor);
        this.taxa = 0.05f;
    }
    public Nacional() {
        super();
        this.taxa = 0.05f;
    }
    public double getTaxa() {
        return taxa;
    }
    @Override
    public double getValorTotal() {
        double vl = this.valor + (this.valor * this.imposto) + this.valor * this.taxa;
        vl = vl * 100;
        vl = Math.round(vl);
        vl = vl / 100;
        return vl;
    }
    @Override
    public String relatorio() {
        return String.format("Atributos {"+
                "descrição: nome do produto"+
                ",valor: valor do produto, Imposto: Imposto do produto, Taxa: Taxa do produto}\n" +
                "Nacional{" +
                "desc='" + desc + '\'' +
                ", valor=" + valor +
                ", imposto=" + imposto +
                ", taxa=" + taxa +
                ", Valor Total=" + (getValorTotal()) +
                '}');
    }
    
}
