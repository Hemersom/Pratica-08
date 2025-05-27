import java.util.Scanner;
public class App {
    final int max = 100;
    Nacional[] nacional = new Nacional[max];
    int contador_nacional = 0;
    Importado[] importado = new Importado[max];
    int contador_importado = 0;
    Estadual[] estadual = new Estadual[max];
    int contador_estadual = 0;
    
    public void cadastrarProduto(Scanner scanner, Produto[] produtos, int contador, String tipo) {
        if (contador < max) {
            System.out.print("Digite a descrição do produto " + tipo + ": ");
            String desc = scanner.nextLine();
            System.out.print("Digite o valor do produto " + tipo + ": ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = null;
            if (tipo.equals("Estadual")) produto = new Estadual(desc, valor);
            if (tipo.equals("Nacional")) produto = new Nacional(desc, valor);
            if (tipo.equals("Importado")) produto = new Importado(desc, valor);

            produtos[contador] = produto;
            System.out.println("Produto " + tipo + " cadastrado com sucesso!");

            if (tipo.equals("Estadual")) contador_estadual++;
            if (tipo.equals("Nacional")) contador_nacional++;
            if (tipo.equals("Importado")) contador_importado++;
        } else {
            System.out.println("Limite de produtos " + tipo + " atingido.");
        }
    }
    public void ExibirProdutos(String tipo, Produto[] produtos, int contador) {
        if (contador == 0) {
            System.out.println("Nenhum produto " + tipo + " cadastrado.");
        } else {
            System.out.println("Produtos " + tipo + ":");
            for (int i = 0; i < contador; i++) {
                System.out.println(produtos[i].relatorio());
            }
        }
    }
    public void exe() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
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
                cadastrarProduto(scanner, estadual, contador_estadual, "Estadual");
                break;
            case 2:
                cadastrarProduto(scanner, nacional, contador_nacional, "Nacional");
                break;
            case 3:
                cadastrarProduto(scanner, importado, contador_importado, "Importado");
                break;
            case 4:
                ExibirProdutos("Estadual", estadual, contador_estadual);
                break;
            case 5:
                ExibirProdutos("Nacional", nacional, contador_nacional);
                break;
            case 6:
                ExibirProdutos("Importado", importado, contador_importado);
                break;
            case 7:
                ExibirProdutos("Estadual", estadual, contador_estadual);
                ExibirProdutos("Nacional", nacional, contador_nacional);
                ExibirProdutos("Importado", importado, contador_importado);
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