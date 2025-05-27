class Estadual {
    protected String desc;
    protected double valor;
    protected double imposto;
    
    public Estadual(String desc, double valor) {
        this.desc = desc;
        this.valor = valor < 0 ? 0.0 : valor; 
        this.imposto = 0.10;
    }

    public Estadual(){
        this.desc = "";
        this.valor = 0.0;
        this.imposto = 0.10f;
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
                "desc='" + desc + '\'' +
                ", valor=" + valor +
                ", imposto=" + imposto +
                ", Valor Total=" + (valor + valor * imposto) +
                '}';
    }

}
