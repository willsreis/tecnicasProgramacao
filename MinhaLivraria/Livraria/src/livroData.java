public class livroData {
    public static void main (String[] args){
       
        Autor autor = new Autor();
        autor.nome = "Zezinho Livreiro";
        autor.email = "zedolivro@livrodubom.com";
        autor.cpf = "123.456.789-10";
        System.out.println(); 

        classLivro livro = new classLivro();
        livro.nome = "Java 8";
        livro.descricao = "Novos recurso da linguagem";
        livro.adicionaValor(59.90);
        livro.isbn = "978-85-66-250-46-6";
        livro.autor = autor;

        livro.mostrarDetalhes();

        System.out.println();


        Autor outroAutor = new Autor();
        outroAutor.nome = "Mariazinha Livreira";
        outroAutor.email = "mariadolivro@livrodubom.com";
        outroAutor.cpf = "024.681.012-14";

        classLivro outroLivro = new classLivro();
        outroLivro.nome = "Sherlock Holmes";
        outroLivro.descricao = "O desafio do tesouro perdido";
        outroLivro.adicionaValor(38.75);
        outroLivro.isbn = "487-52-542-63-CX";
        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();
        System.out.println();

        classLivro livro1 = new classLivro();
        

       
            }
}
