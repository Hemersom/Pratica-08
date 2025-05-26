public class Nacional extends Estadual {
    protected double taxa;
    public Nacional(String desc, double valor) {
        super(desc, valor);
        this.taxa = 0.05;
    }
    public Nacional() {
        super();
        this.taxa = 0.05;
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
                '}';
    }
    
}
