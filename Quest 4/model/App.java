
import java.util.Scanner;

public class App {

    public static void exe(Scanner scanner, Lista lista, ListaOrdenada listaOrdenada) {
        int opcao = -1;
        do {
            System.out.println("+---------- Menu ----------+");
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Buscar elemento");
            System.out.println("3 - Remover elemento");
            System.out.println("4 - Imprimir lista");
            System.out.println("5 - Informar tamanho da lista");
            System.out.println("0 - Sair");
            System.out.print("Escolha >> ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            int opcao2 = 0;
            if (opcao != 0 ){
                System.out.println("1. Lista Simples, 2. Lista Ordenada \nEscolha o tipo de lista:");
                opcao2 = scanner.nextInt();
                scanner.nextLine();
                if (opcao2 != 1 && opcao2 != 2) {
                    System.out.println("Opção inválida, tente novamente.");
                    continue;
                }
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser inserido:");
                    int valor = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao2 == 1) {
                        lista.insere(valor);
                    } else if (opcao2 == 2) {
                        listaOrdenada.insere(valor);
                    }

                    break;
                case 2:
                    System.out.println("Digite a posição do elemento a ser buscado:");
                    int posicaoBusca = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao2 == 1) {
                        int resultadoBusca = lista.Busca(posicaoBusca);
                        if (resultadoBusca != -1) {
                            System.out.println("Elemento encontrado: " + resultadoBusca);
                        } else {
                            System.out.println("Elemento não encontrado na lista simples.");
                        }
                    } else if (opcao2 == 2) {
                        int resultadoBusca = listaOrdenada.Busca(posicaoBusca);
                        if (resultadoBusca != -1) {
                            System.out.println("Elemento encontrado: " + resultadoBusca);
                        } else {
                            System.out.println("Elemento não encontrado na lista ordenada.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite a posição do elemento a ser removido:");
                    int posicaoRemover = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao2 == 1) {
                        lista.remove(posicaoRemover);
                    } else if (opcao2 == 2) {
                        listaOrdenada.remove(posicaoRemover);
                    }
                    break;
                case 4:
                    if (opcao2 == 1) {
                        System.out.println("Lista Simples:");
                        lista.imprime();
                    } else if (opcao2 == 2) {
                        System.out.println("Lista Ordenada:");
                        listaOrdenada.imprime();
                    }
                    break;
                case 5:
                    if (opcao2 == 1) {
                        lista.informarTamanho();
                    } else if (opcao2 == 2) {
                        listaOrdenada.informarTamanho();
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao !=0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a capacidade das listas:");
        int capacidade = scanner.nextInt();
        scanner.nextLine();
        if (capacidade <= 0) {
            System.out.println("Capacidade inválida. O programa será encerrado.");
            scanner.close();
            return;
        }
        System.out.println("Capacidade definida: " + capacidade);
        Lista lista = new Lista(capacidade);
        ListaOrdenada listaOrdenada = new ListaOrdenada(capacidade);
        exe(scanner, lista, listaOrdenada);
    }
}