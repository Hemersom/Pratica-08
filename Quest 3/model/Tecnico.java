class Tecnico extends Funcionario {
    String nivel;

   public  Tecnico(int codigo, String nome, double salario, String nivel) {
        super(codigo, nome, salario);
        this.nivel = nivel;
    }
    public Tecnico() {
        super();
        this.nivel = "";
    }
}
