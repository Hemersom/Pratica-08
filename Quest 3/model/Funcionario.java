class Funcionario {
    int codigo;
    String nome;
    double salario;

    Funcionario(int codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }
    Funcionario() {
        this.codigo = 0;
        this.nome = "";
        this.salario = 0.0;
    }
}
