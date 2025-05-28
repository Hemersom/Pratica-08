class Departamento {
    int codigo;
    String nome;
    int qtdFuncionarios = 0;
    Funcionario[] funcionarios = new Funcionario[100]; 

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public Departamento() {
        this.codigo = 0;
        this.nome = "";
        this.funcionarios = new Funcionario[100];
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
