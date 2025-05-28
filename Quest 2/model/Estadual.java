class Estadual extends Produto {
    protected double imposto = 0.10f; 
    public Estadual(String desc, double valor) {
        super(desc, valor);
    }

    public Estadual(){
        super();
    }

    public double getImposto() {
        return imposto;
    }
    @Override
    public double getValorTotal() {
        double vl = this.valor + this.valor * this.imposto;
        vl = vl*100;
        vl = Math.round(vl);
        vl = vl/100;
        return vl;
    }

    @Override
    public String relatorio() {
    return String.format(
        "Atributos {" +
        "descrição: nome do produto" +
        ", valor: preço base do produto, Imposto: imposto do produto}\n" +
        "Estadual { desc = '%s'" +
        ", valor: R$ %.2f" +
        ", imposto: %.2f " +
        ", Valor Total = R$ %.2f" +
        " }",
        getDesc(),
        getValor(),
        getImposto(),
        getValorTotal()
    );
}


}
