public class Departamento extends Base {
    protected Funcionario[] funcionarios;

    public Departamento(String codigo, String nome, Funcionario[] funcionarios) {
        super(codigo, nome);
        this.funcionarios = funcionarios;
    }

    public Departamento() {
        super();
        this.funcionarios = new Funcionario[0];
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento{")
          .append("codigo='").append(codigo).append('\'')
          .append(", nome='").append(nome).append('\'')
          .append(", funcionarios=");
        
        if (funcionarios.length > 0) {
            for (Funcionario f : funcionarios) {
                sb.append(f.toString()).append("\n");
            }
        } else {
            sb.append("Nenhum funcionario cadastrado");
        }
        sb.append('}');
        return sb.toString();
    }
}
