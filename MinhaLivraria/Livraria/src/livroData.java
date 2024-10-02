import RefatLivraria.Autor;

public class livroData {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Zezinho Livreiro");
        autor.setEmail("zedolivro@livrodubom.com");
        autor.setCpf("123.456.789-10");
        System.out.println();

        ClassLivro livro = new ClassLivro();
        livro.setNome("Java 8");
        livro.setDescricao("Novos recurso da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66-250-46-6");
        livro.setAutor(autor);

        livro.mostrarDetalhes();

        System.out.println();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Mariazinha Livreira");
        outroAutor.setEmail("mariadolivro@livrodubom.com");
        outroAutor.setCpf("024.681.012-14");

        ClassLivro outroLivro = new ClassLivro();
        outroLivro.setNome("Sherlock Holmes");
        outroLivro.setDescricao("O desafio do tesouro perdido");
        outroLivro.setValor(38.75);
        outroLivro.setIsbn("487-52-542-63-CX");
        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();
        System.out.println();       

    }
}
