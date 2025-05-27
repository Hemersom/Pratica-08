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
    public String toString() {
        return "Nacional{" +
                "desc='" + desc + '\'' +
                ", valor=" + valor +
                ", imposto=" + imposto +
                ", taxa=" + taxa +
                "Valor Total=" + (valor + valor * imposto + valor * taxa) +
                '}';
    }
    
}
