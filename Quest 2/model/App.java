
import java.util.Scanner;

public class App {

    final int max = 100;
    Nacional[] nacional = new Nacional[max];
    int contador_nacional = 0;
    Importado[] importado = new Importado[max];
    int contador_importado = 0;
    Estadual[] estadual = new Estadual[max];
    int contador_estadual = 0;

    public void cadastrarEstadual(Scanner scanner) {
        if (contador_estadual < max) {
            System.out.print("Digite a descrição do produto Estadual: ");
            String desc = scanner.nextLine();
            System.out.print("Digite o valor do produto Estadual: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Estadual produto = new Estadual(desc, valor);
            estadual[contador_estadual++] = produto;

            System.out.println("Produto Estadual cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos Estadual atingido.");
        }
    }


    public void cadastrarNacional(Scanner scanner) {
        if (contador_nacional < max) {
            System.out.print("Digite a descrição do produto Nacional: ");
            String desc = scanner.nextLine();
            System.out.print("Digite o valor do produto Nacional: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Nacional produto = new Nacional(desc, valor);
            nacional[contador_nacional++] = produto;

            System.out.println("Produto Nacional cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos Nacional atingido.");
        }
    }

    
    public void cadastrarImportado(Scanner scanner) {
        if (contador_importado < max) {
            System.out.print("Digite a descrição do produto Importado: ");
            String desc = scanner.nextLine();
            System.out.print("Digite o valor do produto Importado: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Importado produto = new Importado(desc, valor);
            importado[contador_importado++] = produto;

            System.out.println("Produto Importado cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos Importado atingido.");
        }
    }

    public void exibirProdutos(String tipo) {
        if (tipo.equals("Estadual")) {
            if (contador_estadual == 0) {
                System.out.println("Nenhum produto Estadual cadastrado.");
            } else {
                System.out.println("Produtos Estaduais:");
                for (int i = 0; i < contador_estadual; i++) {
                    System.out.println(estadual[i].relatorio());
                }
            }
        } else if (tipo.equals("Nacional")) {
            if (contador_nacional == 0) {
                System.out.println("Nenhum produto Nacional cadastrado.");
            } else {
                System.out.println("Produtos Nacionais:");
                for (int i = 0; i < contador_nacional; i++) {
                    System.out.println(nacional[i].relatorio());
                }
            }
        } else if (tipo.equals("Importado")) {
            if (contador_importado == 0) {
                System.out.println("Nenhum produto Importado cadastrado.");
            } else {
                System.out.println("Produtos Importados:");
                for (int i = 0; i < contador_importado; i++) {
                    System.out.println(importado[i].relatorio());
                }
            }
        }
    }


    public void exe() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("+--------------- MENU----------------+");
        System.out.println("1 - Cadastrar Produto Estadual");
        System.out.println("2 - Cadastrar Produto Nacional");
        System.out.println("3 - Cadastrar Produto Importado");
        System.out.println("4 - Exibir Produtos Estaduais");
        System.out.println("5 - Exibir Produtos Nacionais");
        System.out.println("6 - Exibir Produtos Importados");
        System.out.println("7 - Exibir Todos Produtos");
        System.out.println("9 - SAIR");
        int opcao = 0;
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                cadastrarEstadual(scanner);
                break;
            case 2:
                cadastrarNacional(scanner);
                break;
            case 3:
                cadastrarImportado(scanner);
                break;
            case 4:
                exibirProdutos("Estadual");
                break;
            case 5:
                exibirProdutos("Nacional");
                break;
            case 6:
                exibirProdutos("Importado");
                break;
            case 7:
                exibirProdutos("Estadual");
                exibirProdutos("Nacional");
                exibirProdutos("Importado");
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
