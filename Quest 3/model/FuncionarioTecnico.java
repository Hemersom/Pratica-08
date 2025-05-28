public class FuncionarioTecnico extends Funcionario {
    protected String titulacao;

    public FuncionarioTecnico(String codigo, String nome, double salario, String titulacao) {
        super(codigo, nome, salario);
        this.titulacao = titulacao;
    }

    public FuncionarioTecnico() {
        super();
        this.titulacao = "";
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Funcionario Tecnico: " +
                "codigo='" + this.codigo + '\'' +
                ", nome='" + this.nome + '\'' +
                ", salario=" + this.salario +
                ", titulacao='" + this.titulacao + '\'' +
                '\n';
    }
}
