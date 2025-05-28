public class Funcionario extends Base {
    protected double salario;

    public Funcionario(String codigo, String nome, double salario) {
        super(codigo, nome);
        this.salario = salario;
    }
    public Funcionario() {
        super();
        this.salario = 0.0;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
