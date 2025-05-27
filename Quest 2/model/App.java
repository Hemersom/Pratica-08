import java.util.Scanner;
public class App {
    final int max = 100;
    Nacional[] nacional = new Nacional[max];
    int contador_nacional = 0;
    Importado[] importado = new Importado[max];
    int contador_importado = 0;
    Estadual[] estadual = new Estadual[max];
    int contador_estadual = 0;
    public void CadastrarProdutoEstadual(Scanner scanner) {
        String desc;
        if (contador_estadual < max) {
            System.out.print("Digite a descrição do produto estadual: ");
            desc = scanner.nextLine();
            System.out.print("Digite o valor do produto estadual: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            Estadual produto = new Estadual(desc, valor);
            estadual[contador_estadual++] = produto;
            System.out.println("Produto Estadual cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos estaduais atingido.");
        }

    }
    public void CadastrarProdutoNacional(Scanner scanner) {
        if (contador_nacional < max) {
            System.out.print("Digite a descrição do produto nacional: ");
            String desc = scanner.nextLine();

            System.out.print("Digite o valor do produto nacional: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            Nacional produto = new Nacional(desc, valor);
            nacional[contador_nacional++] = produto;
            System.out.println("Produto Nacional cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos nacionais atingido.");
        }
    }

    public void CadastrarProdutoImportado(Scanner scanner) {
        String desc;
        double valor;
        if (contador_importado < max) {
            System.out.print("Digite a descrição do produto importado: ");
            desc = scanner.nextLine();
            System.out.print("Digite o valor do produto importado: ");
            valor = scanner.nextDouble();
            scanner.nextLine();
            if (valor <= 0) {
                System.out.println("Valor inválido. O valor deve ser maior que zero.");
                return;
            }
            Importado produto = new Importado(desc, valor);
            importado[contador_importado++] = produto;
            System.out.println("Produto Importado cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos importados atingido.");
        }
    }

    public void ExibirProdutosEstaduais() {
        if (contador_estadual == 0) {
            System.out.println("Nenhum produto estadual cadastrado.");
        } else {
            System.out.println("Produtos Estaduais:");
            for (int i = 0; i < contador_estadual; i++) {
                System.out.println(estadual[i]);
            }
        }
    }

    public void ExibirProdutosNacionais() {
        if (contador_nacional == 0) {
            System.out.println("Nenhum produto nacional cadastrado.");
        } else {
            System.out.println("Produtos Nacionais:");
            for (int i = 0; i < contador_nacional; i++) {
                System.out.println(nacional[i]);
            }
        }
    }

    public void ExibirProdutosImportados() {
        if (contador_importado == 0) {
            System.out.println("Nenhum produto importado cadastrado.");
        } else {
            System.out.println("Produtos Importados:");
            for (int i = 0; i < contador_importado; i++) {
                System.out.println(importado[i]);
            }
        }
    }

    public void ExibirTodosProdutos() {
        ExibirProdutosEstaduais();
        ExibirProdutosNacionais();
        ExibirProdutosImportados();
    }
    public void pause(Scanner scanner) {
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }
    public void limparTela() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela: " + e.getMessage());
        }
    }
    public void exe() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        pause(scanner);
        limparTela();
        System.out.println("+--------------- MENU----------------+");
        System.out.println("1 – Cadastrar Produto Estadual");
        System.out.println("2 – Cadastrar Produto Nacional");
        System.out.println("3 – Cadastrar Produto Importado");
        System.out.println("4 – Exibir Produtos Estaduais");
        System.out.println("5 – Exibir Produtos Nacionais");
        System.out.println("6 – Exibir Produtos Importados");
        System.out.println("7 – Exibir Todos Produtos");
        System.out.println("9 – SAIR");
        int opcao = 0;
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); 
        switch (opcao) {
            case 1:
                CadastrarProdutoEstadual(scanner);
                break;
            case 2:
                CadastrarProdutoNacional(scanner);
                break;
            case 3:
                CadastrarProdutoImportado(scanner);
                break;
            case 4:
                ExibirProdutosEstaduais();
                break;
            case 5:
                ExibirProdutosNacionais();
                break;
            case 6:
                ExibirProdutosImportados();
                break;
            case 7:
                ExibirTodosProdutos();
                break;
            case 9:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
    public static void main(String[] args) {
        App app = new App();
        while (true) { 
            app.exe();
        }
    }
}