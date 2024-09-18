public class livroData {
    public static void main (String[] args){
       
        Autor autor = new Autor();
        autor.nome = "Zezinho Livreiro";
        autor.email = "zedolivro@livrodubom.com";
        autor.cpf = "123.456.789-10";

        Livro livro = new Livro();
        livro.nome = "Java 8";
        livro.descricao = "Novos recurso da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66-250-46-6";

        livro.autor = autor;

        livro.mostrarDetalhes();

        // System.out.println("O nome do livro é: " + livro.nome);
        // System.out.println("Descrição: " + livro.descricao);
        // System.out.println("Valor do livro: " + livro.valor);
        // System.out.println("isbn: "+ livro.isbn);
        
        System.out.println(); 

        Autor outroAutor = new Autor();
        outroAutor.nome = "Mariazinha Livreira";
        outroAutor.email = "mariadolivro@livrodubom.com";
        outroAutor.cpf = "024.681.012-14";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Sherlock Holmes";
        outroLivro.descricao = "O desafio do tesouro perdido";
        outroLivro.valor = 38.75;
        outroLivro.isbn = "487-52-542-63-CX";
        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();

        // System.out.println("O nome do livro é: "+ outroLivro.nome);
        // System.out.println("Descrição: " +outroLivro.descricao);
        // System.out.println("Valor do livro: " + outroLivro.valor);
        // System.out.println("isbn: " + outroLivro.isbn);
        
        System.out.println();
        

       
            }
}


public class Livro {
    // public static void main (String[] args){
           
    
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;


void mostrarDetalhes() {
    String mensagem = "Mostrando detalhes do livro";
    System.out.println(mensagem);
    System.out.println("Nome: "+nome);
    System.out.println("Descrição: " +descricao);
    System.out.println("Valor: " +valor);
    System.out.println("ISBN: " +isbn);
    System.out.println();
    String mensagem2 = "Mostrando detalhes do autor";
    System.out.println(mensagem2);
    System.out.println("Nome: "+autor.nome);
    System.out.println("E-mail: "+autor.email);
    System.out.println("CPF: " +autor.cpf);

}
}

public class Autor {
    String nome;
    String email;
    String cpf;
}