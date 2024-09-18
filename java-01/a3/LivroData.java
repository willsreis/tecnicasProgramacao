import Livro.Livro;

public class LivroData {
    public static void main (String[] args){
       
        
        Livro livro = new Livro();
        livro.nome = "Java 8";
        livro.descricao = "Novos recurso da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66-250-46-6";

        livro.mostrarDetalhes();

        // System.out.println("O nome do livro é: " + livro.nome);
        // System.out.println("Descrição: " + livro.descricao);
        // System.out.println("Valor do livro: " + livro.valor);
        // System.out.println("isbn: "+ livro.isbn);
        
        System.out.println(); 

        Livro outroLivro = new Livro();
        outroLivro.nome = "Sherlock Holmes";
        outroLivro.descricao = "O desafio do tesouro perdido";
        outroLivro.valor = 38.75;
        outroLivro.isbn = "487-52-542-63-CX";

        outroLivro.mostrarDetalhes();

        // System.out.println("O nome do livro é: "+ outroLivro.nome);
        // System.out.println("Descrição: " +outroLivro.descricao);
        // System.out.println("Valor do livro: " + outroLivro.valor);
        // System.out.println("isbn: " + outroLivro.isbn);
        
        System.out.println();
        
       
            }
}


// public class Livro {
//     // public static void main (String[] args){
           
    
//     String nome;
//     String descricao;
//     double valor;
//     String isbn;


// void mostrarDetalhes() {
//     String mensagem = "Mostrando detalhes do livro";
//     System.out.println(mensagem);
//     System.out.println(nome);
//     System.out.println(descricao);
//     System.out.println(valor);
//     System.out.println(isbn);

// }
// }