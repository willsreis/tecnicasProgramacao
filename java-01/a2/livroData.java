public class livroData {
    public static void main (String[] args){
       

        Livro livro = new Livro();
        livro.nome = "Java 8";
        livro.descricao = "Novos recurso da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66-250-46-6";

        System.out.println("O nome do livro é: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("O valor do livro é: " + livro.valor);
        System.out.println("isbn: "+ livro.isbn);

        System.out.println();
        System.out.println();
        Livro outroLivro = new Livro();
        outroLivro.nome = "Sherlock Holmes";
        outroLivro.descricao = "O desafio do tesouro perdido";
        outroLivro.valor = 38.75;
        outroLivro.isbn = "487-52-542-63-CX";

        System.out.println("O nome do livro é: "+ outroLivro.nome);
        System.out.println("Descrição: " +outroLivro.descricao);
        System.out.println("Valor do livro: " + outroLivro.valor);
        System.out.println("isbn: " + outroLivro.isbn);
        
            }
}
public class Livro {
    // public static void main (String[] args){
           
    
    String nome;
    String descricao;
    double valor;
    String isbn;

}