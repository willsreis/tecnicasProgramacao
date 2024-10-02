import RefatLivraria.Autor;

public class Desconto {

    public static void main(String[] args) {

        ClassLivro livro = new ClassLivro();
        // livro.valor = 59.90;
        livro.setValor(59.90);
        System.out.println("Valor atual: " + livro.getValor());

        // livro.valor -= livro.valor * 0.1;
        if (!livro.aplicaDescontoDe(0.29)){
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com o desconto:" + livro.getValor());
        }
        // livro.aplicaDescontoDe(0.1);
        // livro.valor -= livro.valor * 0.4;
        // livro.aplicaDescontoDe(0.4);
        // System.out.println("Valor com desconto: " + livro.retornaValor());
        System.out.println();

        Autor autor = new Autor();
		autor.setNome("Javerinho Torto");
		livro.setAutor(autor); 
        livro.setNome("Livrinho de Java");
        livro.setDescricao("TesteBatatinha");
        livro.setIsbn("1298398312938293");
        autor.setCpf("235.896.572-15");
        autor.setEmail("caixamail@tomail.com");
		livro.mostrarDetalhes();
   
    }

}
