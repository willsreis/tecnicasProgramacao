public class CalculadoraDeEstoque {
    public static void main (String[] args){

        double livroJava8 = 59.90;
        double livroTDD = 159.90;   

        double soma = livroJava8 + livroTDD;
        System.out.println("O total de livros é " + soma);

        // Livro livro = new Livro();
        // livro.nome = "Java 8";
        // livro.descricao = "Novos recurso da linguagem";
        // livro.valor = 59.90;
        // livro.isbn = "978-85-66-250-46-6";

        // System.out.println(livro.nome);
        // System.out.println(livro.descricao);
        // System.out.println(livro.valor);
        // System.out.println(livro.isbn);

        if (soma < 150) {
        System.out.println("o total nao tem direito a desconto");
        } else {
            System.out.println("O total garante desconto de 10%");
        }

        int contador = 0;

        while (contador <5) {
            contador ++;
            double valorLivro = livroJava8;
            soma += valorLivro;
            contador++;
            System.out.println("contador: " + contador);
        }

        for (int i =0; i <= 1 ; i++) {
            if (i ==7){
                continue;
            }
            System.err.println(i);
        }

        for (int i =0; i <= 1; i++) {
            if (i ==7){
                break;
            }
            System.err.println(i);
        }

    }
}
public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;

}