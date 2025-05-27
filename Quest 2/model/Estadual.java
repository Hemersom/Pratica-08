class Estadual extends Produto {
    protected double imposto = 0.10f; 
    public Estadual(String desc, double valor) {
        super(desc, valor);
    }

    public Estadual(){
        super();
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor < 0 ? 0.0 : valor;
    }
    public double getImposto() {
        return imposto;
    }

    @Override
    public String toString() {
        return "Estadual{" +
                "desc='" + this.desc + '\'' +
                ", valor=" + this.valor +
                ", imposto=" + this.imposto +
                ", Valor Total=" + (this.valor + this.valor * this.imposto) +
                '}';
    }

}
