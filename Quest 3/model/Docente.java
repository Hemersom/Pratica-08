class Docente extends Funcionario {
    String titulacao;

    public Docente(int codigo, String nome, double salario, String titulacao) {
        super(codigo, nome, salario);
        this.titulacao = titulacao;
    }
    public Docente() {
        super();
        this.titulacao = "";
    }
}