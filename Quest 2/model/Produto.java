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
    public double getValorTotal() {
        return valor;
    }
    public String relatorio() {
        return  String.format("Atributos {"+
                "descrição: nome do produto"+
                ",valor: valor do produto}\n" +
                "Produto{" +
                "desc='" + desc + '\'' +
                ", valor: R$" + valor +
                ", Valor Total: R$" + (getValorTotal()) +
                '}');
    }

}
