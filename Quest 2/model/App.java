public class App {
    public static void main(String[] args) {
        
    }
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
    public static void menu() {
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
                // Cadastrar Produto Estadual
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
}
