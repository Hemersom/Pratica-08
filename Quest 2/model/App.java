
import java.util.Scanner;

public class App {
    final int max = 100;
    Nacional[] nacional = new Nacional[max];
    int contador_nacional = 0;
    Importado[] importado = new Importado[max];
    int contador_importado = 0;
    Estadual[] estadual = new Estadual[max];
    int contador_estadual = 0;
    
    /* MENU

1 – Cadastrar Produto Estadual

2 – Cadastrar Produto Nacional

3 – Cadastrar Produto Importado

4 – Exibir Produtos Estaduais

5 – Exibir Produtos Nacionais

6 – Exibir Produtos Importados

7 – Exibir Todos Produtos

9 – SAIR
*/  
    public void CadastrarProdutoEstadual(Scanner scanner) {
        String desc;
        System.out.print("Digite a descrição do produto estadual: ");
        desc = scanner.nextLine();
        scanner.nextLine();
        double valor;
        System.out.print("Digite o valor do produto estadual: ");
        valor = scanner.nextDouble();
        Estadual produto = new Estadual(desc, valor);
        if (contador_estadual < max) {
            estadual[contador_estadual++] = produto;
            System.out.println("Produto Estadual cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos estaduais atingido.");
        }
    }
    public void CadastrarProdutoNacional(String desc, double valor) {
        Nacional produto = new Nacional(desc, valor);
        if (contador_nacional < max) {
            nacional[contador_nacional++] = produto;
            System.out.println("Produto Nacional cadastrado com sucesso!");
        } else {
            System.out.println("Limite de produtos nacionais atingido.");
        }
    }
    public void CadastrarProdutoImportado(String desc, double valor) {
        Importado produto = new Importado(desc, valor);
        if (contador_importado < max) {
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
     
    public void exe() {
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
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                
                CadastrarProdutoEstadual(desc,valor);
                break;
            case 2:
                // Cadastrar Produto Nacional
                break;
            case 3:
                // Cadastrar Produto Importado
                break;
            case 4:
                // Exibir Produtos Estaduais
                break;
            case 5:
                // Exibir Produtos Nacionais
                break;
            case 6:
                // Exibir Produtos Importados
                break;
            case 7:
                // Exibir Todos Produtos
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
        
    }  
}
