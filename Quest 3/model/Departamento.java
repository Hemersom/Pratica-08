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
}
