import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String nome;
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir nome");
            System.out.println("2. Apagar nome");
            System.out.println("3. Consultar tamanho da lista");
            System.out.println("4. Pesquisar nome na lista");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Limpar lista");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome para inserir: ");
                    nome = scanner.nextLine();
                    lista.add(nome);
                    System.out.println("Nome adicionado.");
                    break;
                case 2:
                    System.out.print("Digite o nome para apagar: ");
                    nome = scanner.nextLine();
                    if (lista.remove(nome)) {
                        System.out.println("Nome removido.");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Tamanho da lista: " + lista.size());
                    break;
                case 4:
                    System.out.print("Digite o nome para pesquisar: ");
                    nome = scanner.nextLine();
                    if (lista.contains(nome)) {
                        System.out.println("Nome encontrado.");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Lista de nomes: " + lista);
                    break;
                case 6:
                    lista.clear();
                    System.out.println("Lista limpa.");
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}
