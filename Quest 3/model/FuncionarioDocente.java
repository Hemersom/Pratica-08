public class FuncionarioDocente extends Funcionario{
    protected String titulacao;
    public FuncionarioDocente(String codigo, String nome, double salario, String titulacao) {
        super(codigo, nome, salario);
        this.titulacao = titulacao;
    }
    public FuncionarioDocente() {
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
        return "Funcionario Docente: " +
                "codigo='" + this.codigo + '\'' +
                ", nome='" + this.nome + '\'' +
                ", salario=" + this.salario +
                ", titulacao='" + this.titulacao + '\'' +
                '\n';
    }
}
