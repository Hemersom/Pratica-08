import java.util.*;
public class UniversidadeSistema {

    static Departamento[] departamentos = new Departamento[10];  // Máximo 10 departamentos
    static int qtdDepartamentos = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1 - Cadastrar Departamento");
            System.out.println("2 - Cadastrar Funcionário Técnico");
            System.out.println("3 - Cadastrar Funcionário Docente");
            System.out.println("4 - Buscar Departamento por Nome");
            System.out.println("5 - Buscar Funcionário por Nome");
            System.out.println("6 - Listar Departamentos com Funcionários com Faixa Salarial Específica");
            System.out.println("7 - Listar Funcionários com Faixa Salarial Específica");
            System.out.println("8 - Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica");
            System.out.println("9 - Listar todos Funcionários da Universidade");
            System.out.println("10 - Listar todos Departamentos da Universidade");
            System.out.println("11 - Listar todos Departamentos e seus Respectivos Funcionários");
            System.out.println("12 - Listar todos Funcionários Docente");
            System.out.println("13 - Listar todos Funcionários Técnico");
            System.out.println("0 - Sair");
            System.out.print("Escolha >>");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarDepartamento();
                case 2 -> cadastrarTecnico();
                case 3 -> cadastrarDocente();
                case 4 -> buscarDepartamentoPorNome();
                case 5 -> buscarFuncionarioPorNome();
                case 6 -> listarDepartamentosPorFaixaSalarial();
                case 7 -> listarFuncionariosPorFaixaSalarial();
                case 8 -> listarDepartamentosPorGastoTotal();
                case 9 -> listarTodosFuncionarios();
                case 10 -> listarDepartamentos();
                case 11 -> listarDepartamentosEFuncionarios();
                case 12 -> listarFuncionariosDocente();
                case 13 -> listarFuncionariosTecnico();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    static void cadastrarDepartamento() {
        if (qtdDepartamentos >= departamentos.length) {
            System.out.println("Limite de departamentos atingido!");
            return;
        }

        Departamento dep = new Departamento();

        System.out.print("Código: ");
        dep.codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        dep.nome = sc.nextLine();

        departamentos[qtdDepartamentos++] = dep;

        System.out.println("Departamento cadastrado com sucesso!");
    }

    static Departamento buscarDepartamentoPorCodigo(int codigo) {
        for (int i = 0; i < qtdDepartamentos; i++) {
            if (departamentos[i].codigo == codigo) {
                return departamentos[i];
            }
        }
        return null;
    }

    static void cadastrarTecnico() {
        System.out.print("Código do Departamento: ");
        int codDep = sc.nextInt();
        sc.nextLine();

        Departamento dep = buscarDepartamentoPorCodigo(codDep);
        if (dep == null) {
            System.out.println("Departamento não encontrado!");
            return;
        }

        if (dep.qtdFuncionarios >= dep.funcionarios.length) {
            System.out.println("Limite de funcionários nesse departamento atingido!");
            return;
        }

        Tecnico tecnico = new Tecnico();

        System.out.print("Código: ");
        tecnico.codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        tecnico.nome = sc.nextLine();

        System.out.print("Salário: ");
        tecnico.salario = sc.nextDouble();
        sc.nextLine();

        System.out.print("Nível: ");
        tecnico.nivel = sc.nextLine();

        dep.funcionarios[dep.qtdFuncionarios++] = tecnico;

        System.out.println("Funcionário Técnico cadastrado com sucesso!");
    }

    static void cadastrarDocente() {
        System.out.print("Código do Departamento: ");
        int codDep = sc.nextInt();
        sc.nextLine();

        Departamento dep = buscarDepartamentoPorCodigo(codDep);
        if (dep == null) {
            System.out.println("Departamento não encontrado!");
            return;
        }

        if (dep.qtdFuncionarios >= dep.funcionarios.length) {
            System.out.println("Limite de funcionários nesse departamento atingido!");
            return;
        }

        Docente docente = new Docente();

        System.out.print("Código: ");
        docente.codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        docente.nome = sc.nextLine();

        System.out.print("Salário: ");
        docente.salario = sc.nextDouble();
        sc.nextLine();

        System.out.print("Titulação: ");
        docente.titulacao = sc.nextLine();

        dep.funcionarios[dep.qtdFuncionarios++] = docente;

        System.out.println("Funcionário Docente cadastrado com sucesso!");
    }

    static void buscarDepartamentoPorNome() {
        System.out.print("Nome do Departamento: ");
        String nome = sc.nextLine();

        for (int i = 0; i < qtdDepartamentos; i++) {
            if (departamentos[i].nome.equalsIgnoreCase(nome)) {
                System.out.println("Departamento encontrado: Código " + departamentos[i].codigo);
                return;
            }
        }
        System.out.println("Departamento não encontrado.");
    }

    static void buscarFuncionarioPorNome() {
        System.out.print("Nome do Funcionário: ");
        String nome = sc.nextLine();

        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                if (dep.funcionarios[j].nome.equalsIgnoreCase(nome)) {
                    System.out.println("Funcionário encontrado: " + dep.funcionarios[j].nome +
                            ", Código: " + dep.funcionarios[j].codigo +
                            ", Departamento: " + dep.nome);
                    return;
                }
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    static void listarDepartamentosPorFaixaSalarial() {
        System.out.print("Salário mínimo: ");
        double min = sc.nextDouble();
        System.out.print("Salário máximo: ");
        double max = sc.nextDouble();

        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            boolean encontrou = false;
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                if (dep.funcionarios[j].salario >= min && dep.funcionarios[j].salario <= max) {
                    encontrou = true;
                    break;
                }
            }
            if (encontrou) {
                System.out.println("Departamento: " + dep.nome);
            }
        }
    }

    static void listarFuncionariosPorFaixaSalarial() {
        System.out.print("Salário mínimo: ");
        double min = sc.nextDouble();
        System.out.print("Salário máximo: ");
        double max = sc.nextDouble();

        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                Funcionario f = dep.funcionarios[j];
                if (f.salario >= min && f.salario <= max) {
                    System.out.println("Funcionário: " + f.nome + ", Salário: " + f.salario + ", Departamento: " + dep.nome);
                }
            }
        }
    }

    static void listarDepartamentosPorGastoTotal() {
        System.out.print("Gasto mínimo: ");
        double min = sc.nextDouble();
        System.out.print("Gasto máximo: ");
        double max = sc.nextDouble();

        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            double total = 0;
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                total += dep.funcionarios[j].salario;
            }
            if (total >= min && total <= max) {
                System.out.println("Departamento: " + dep.nome + ", Gasto Total: " + total);
            }
        }
    }

    static void listarTodosFuncionarios() {
        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                System.out.println("Funcionário: " + dep.funcionarios[j].nome + ", Departamento: " + dep.nome);
            }
        }
    }

    static void listarDepartamentos() {
        for (int i = 0; i < qtdDepartamentos; i++) {
            System.out.println("Departamento: " + departamentos[i].nome + ", Código: " + departamentos[i].codigo);
        }
    }

    static void listarDepartamentosEFuncionarios() {
        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            System.out.println("Departamento: " + dep.nome);
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                System.out.println("  Funcionário: " + dep.funcionarios[j].nome);
            }
        }
    }

    static void listarFuncionariosDocente() {
        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                if (dep.funcionarios[j] instanceof Docente) {
                    System.out.println("Docente: " + dep.funcionarios[j].nome + ", Departamento: " + dep.nome);
                }
            }
        }
    }

    static void listarFuncionariosTecnico() {
        for (int i = 0; i < qtdDepartamentos; i++) {
            Departamento dep = departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                if (dep.funcionarios[j] instanceof Tecnico) {
                    System.out.println("Técnico: " + dep.funcionarios[j].nome + ", Departamento: " + dep.nome);
                }
            }
        }
    }
}