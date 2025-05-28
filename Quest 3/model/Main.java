import java.util.Scanner;

public class Main {


    static final int MAX_DEPARTAMENTOS = 10;
    static final int MAX_FUNCIONARIOS = 20;

    static Departamento[] departamentos = new Departamento[MAX_DEPARTAMENTOS];
    static int qtdDepartamentos = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Departamento");
            System.out.println("2 - Cadastrar Técnico");
            System.out.println("3 - Cadastrar Docente");
            System.out.println("4 - Buscar Departamento por Nome");
            System.out.println("5 - Buscar Funcionário por Nome");
            System.out.println("6 - Listar Departamentos por Faixa Salarial");
            System.out.println("7 - Listar Funcionários por Faixa Salarial");
            System.out.println("8 - Listar Departamentos por Gasto Total");
            System.out.println("9 - Listar Todos Funcionários");
            System.out.println("10 - Listar Todos Departamentos");
            System.out.println("11 - Listar Departamentos e Funcionários");
            System.out.println("12 - Listar Funcionários Docente");
            System.out.println("13 - Listar Funcionários Técnico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Metodos.cadastrarDepartamento();
                    break;
                case 2:
                    Metodos.cadastrarTecnico();
                    break;
                case 3:
                    Metodos.cadastrarDocente();
                    break;
                case 4:
                    Metodos.buscarDepartamentoPorNome();
                    break;
                case 5:
                    Metodos.buscarFuncionarioPorNome();
                    break;
                case 6:
                    Metodos.listarDepartamentosPorFaixaSalarial();
                    break;
                case 7:
                    Metodos.listarFuncionariosPorFaixaSalarial();
                    break;
                case 8:
                    Metodos.listarDepartamentosPorGastoTotal();
                    break;
                case 9:
                    Metodos.listarTodosFuncionarios();
                    break;
                case 10:
                    Metodos.listarDepartamentos();
                    break;
                case 11:
                    Metodos.listarDepartamentosEFuncionarios();
                    break;
                case 12:
                    Metodos.listarFuncionariosDocente();
                    break;
                case 13:
                    Metodos.listarFuncionariosTecnico();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
