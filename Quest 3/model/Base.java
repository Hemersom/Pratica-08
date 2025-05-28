class Base{
    protected String codigo;
    protected String nome;

    public Base(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public Base() {
        this.codigo = "";
        this.nome = "";
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Base" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome+"\n";
    }
}