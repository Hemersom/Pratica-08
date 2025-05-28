class Metodos {
    static void cadastrarDepartamento() {
        if (Main.qtdDepartamentos >= Main.departamentos.length) {
            System.out.println("Limite de departamentos atingido!");
            return;
        }

        Departamento dep = new Departamento();

        System.out.print("Código: ");
        dep.codigo = Main.sc.nextInt();
        Main.sc.nextLine();

        System.out.print("Nome: ");
        dep.nome = Main.sc.nextLine();

        Main.departamentos[Main.qtdDepartamentos++] = dep;

        System.out.println("Departamento cadastrado com sucesso!");
    }

    static Departamento buscarDepartamentoPorCodigo(int codigo) {
        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            if (Main.departamentos[i].codigo == codigo) {
                return Main.departamentos[i];
            }
        }
        return null;
    }

    static void cadastrarTecnico() {
        System.out.print("Código do Departamento: ");
        int codDep = Main.sc.nextInt();
        Main.sc.nextLine();

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
        tecnico.codigo = Main.sc.nextInt();
        Main.sc.nextLine();

        System.out.print("Nome: ");
        tecnico.nome = Main.sc.nextLine();

        System.out.print("Salário: ");
        tecnico.salario = Main.sc.nextDouble();
        Main.sc.nextLine();

        System.out.print("Nível: ");
        tecnico.nivel = Main.sc.nextLine();

        dep.funcionarios[dep.qtdFuncionarios++] = tecnico;

        System.out.println("Funcionário Técnico cadastrado com sucesso!");
    }

    static void cadastrarDocente() {
        System.out.print("Código do Departamento: ");
        int codDep = Main.sc.nextInt();
        Main.sc.nextLine();

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
        docente.codigo = Main.sc.nextInt();
        Main.sc.nextLine();

        System.out.print("Nome: ");
        docente.nome = Main.sc.nextLine();

        System.out.print("Salário: ");
        docente.salario = Main.sc.nextDouble();
        Main.sc.nextLine();

        System.out.print("Titulação: ");
        docente.titulacao = Main.sc.nextLine();

        dep.funcionarios[dep.qtdFuncionarios++] = docente;

        System.out.println("Funcionário Docente cadastrado com sucesso!");
    }

    static void buscarDepartamentoPorNome() {
        System.out.print("Nome do Departamento: ");
        String nome = Main.sc.nextLine();

        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            if (Main.departamentos[i].nome.equalsIgnoreCase(nome)) {
                System.out.println("Departamento encontrado: Código " + Main.departamentos[i].codigo);
                return;
            }
        }
        System.out.println("Departamento não encontrado.");
    }

    static void buscarFuncionarioPorNome() {
        System.out.print("Nome do Funcionário: ");
        String nome = Main.sc.nextLine();

        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
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
        double min = Main.sc.nextDouble();
        System.out.print("Salário máximo: ");
        double max = Main.sc.nextDouble();

        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
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
        double min = Main.sc.nextDouble();
        System.out.print("Salário máximo: ");
        double max = Main.sc.nextDouble();

        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
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
        double min = Main.sc.nextDouble();
        System.out.print("Gasto máximo: ");
        double max = Main.sc.nextDouble();

        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
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
        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                System.out.println("Funcionário: " + dep.funcionarios[j].nome + ", Departamento: " + dep.nome);
            }
        }
    }

    static void listarDepartamentos() {
        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            System.out.println("Departamento: " + Main.departamentos[i].nome + ", Código: " + Main.departamentos[i].codigo);
        }
    }

    static void listarDepartamentosEFuncionarios() {
        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
            System.out.println("Departamento: " + dep.nome);
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                System.out.println("  Funcionário: " + dep.funcionarios[j].nome);
            }
        }
    }

    static void listarFuncionariosDocente() {
        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                if (dep.funcionarios[j] instanceof Docente) {
                    System.out.println("Docente: " + dep.funcionarios[j].nome + ", Departamento: " + dep.nome);
                }
            }
        }
    }

    static void listarFuncionariosTecnico() {
        for (int i = 0; i < Main.qtdDepartamentos; i++) {
            Departamento dep = Main.departamentos[i];
            for (int j = 0; j < dep.qtdFuncionarios; j++) {
                if (dep.funcionarios[j] instanceof Tecnico) {
                    System.out.println("Técnico: " + dep.funcionarios[j].nome + ", Departamento: " + dep.nome);
                }
            }
        }
    }
}
