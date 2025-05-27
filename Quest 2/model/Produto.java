public class Produto {
    protected String desc;
    protected double valor;
    

    public Produto(String desc, double valor) {
        this.desc = desc;
        this.valor = valor < 0 ? 0.0 : valor; 
    }
    public Produto() {
        this.desc = "";
        this.valor = 0.0;
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
    @Override
    public String toString() {
        return "Produto{" +
                "desc='" + desc + '\'' +
                ", valor=" + valor +
                ", Valor Total=" + (valor) +
                '}';
    }

}
