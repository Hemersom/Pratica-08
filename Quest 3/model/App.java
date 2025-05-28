import  java.util.Scanner;

public class App {
    int max = 50;
    Departamento[] Universidade = new Departamento[max];
    int contadorDepartamento = 0;
    FuncionarioDocente[] funcionarioDocente = new FuncionarioDocente[max];
    int contadorFuncionarioDocente = 0;
    FuncionarioTecnico[] funcionarioTecnico = new FuncionarioTecnico[max];
    int contadorFuncionarioTecnico = 0;

    void cadastrarDepartamento(Scanner scanner) {
        if (contadorDepartamento < max) {
            System.out.print("Digite o código do departamento: ");
            String codigo = scanner.next();
            System.out.print("Digite o nome do departamento: ");
            String nome = scanner.next();
            Departamento departamento = new Departamento(codigo, nome, new Funcionario[0]);
            this.departamento[contadorDepartamento] = departamento;
            contadorDepartamento++;
        } else {
            System.out.println("Limite de departamentos atingido.");
        }
    }

    public static void main(String[] args) {
        
    }
    /*
    1 – Cadastrar Departamento
    2 – Cadastrar Funcionário Técnico
    3 – Cadastrar Funcionário Docente
    4 – Buscar Departamento por Nome
    5 – Buscar Funcionário por Nome
    6 – Listar Departamentos com Funcionários com Faixa Salarial Específica
    7 – Listar Funcionários com Faixa Salarial Específica
    8 – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica
    9 – Listar todos Funcionários da Universidade
    10 – Listar todos Departamentos da Universidade
    11 – Listar todos Departamentos da Universidade e seus Respectivos Funcionários
    12 – Listar todos Funcionários Docente
    13 – Listar todos Funcionários Técnico
    0 – Sair
     */
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de Opções:");
        System.out.println("1 – Cadastrar Departamento");
        System.out.println("2 – Cadastrar Funcionário Técnico");
        System.out.println("3 – Cadastrar Funcionário Docente");
        System.out.println("4 – Buscar Departamento por Nome");
        System.out.println("5 – Buscar Funcionário por Nome");
        System.out.println("6 – Listar Departamentos com Funcionários com Faixa Salarial Específica");
        System.out.println("7 – Listar Funcionários com Faixa Salarial Específica");
        System.out.println("8 – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica");
        System.out.println("9 – Listar todos Funcionários da Universidade");
        System.out.println("10 – Listar todos Departamentos da Universidade");
        System.out.println("11 – Listar todos Departamentos da Universidade e seus Respectivos Funcionários");
        System.out.println("12 – Listar todos Funcionários Docente");
        System.out.println("13 – Listar todos Funcionários Técnico");
        System.out.println("0 – Sair");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                // Cadastrar Departamento
                break;
            case 2:
                // Cadastrar Funcionário Técnico
                break;
            case 3:
                // Cadastrar Funcionário Docente
                break;
            case 4:
                // Buscar Departamento por Nome
                break;
            case 5:
                // Buscar Funcionário por Nome
                break;
            case 6:
                // Listar Departamentos com Funcionários com Faixa Salarial Específica
                break;
            case 7:
                // Listar Funcionários com Faixa Salarial Específica
                break;
            case 8:
                // Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica
                break;
            case 9:
                // Listar todos Funcionários da Universidade
                break;
            case 10:
                // Listar todos Departamentos da Universidade
                break;
            case 11:
                // Listar todos Departamentos da Universidade e seus Respectivos Funcionários
                break;
            case 12:
                // Listar todos Funcionários Docente
                break;
            case 13:
                // Listar todos Funcionários Técnico
                break;
            case 0:
                System.out.println("Saindo...");
                return; // Sair do programa
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

    }
}
