import java.util.Scanner;

class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public boolean calculeIMC() {
        double imc = peso / (altura * altura);
        return imc >= 25; 
    }

    public double setAltura() {
        return altura;
    }

    public double setPeso() {
        return peso;
    }
}

public class ImcCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a altura: ");
                    double altura = scanner.nextDouble();
                    double peso;
                    while (true) {
                        System.out.print("Digite o peso: ");
                        peso = scanner.nextDouble();
                        if (peso < 0 || peso > 200) {
                            System.out.println("Peso inválido, digite novamente.");
                        } else {
                            break;
                        }
                    }
                    pessoa = new Pessoa(altura, peso);
                    if (pessoa.calculeIMC()) {
                        System.out.println("SOBREPESO");
                    } else {
                        System.out.println("PESO_NORMAL");
                    }
                    break;

                case 2:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 2);

        scanner.close();
    }
}
