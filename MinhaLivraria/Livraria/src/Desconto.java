public class Desconto {

    public static void main(String[] args) {

        classLivro livro = new classLivro();
        livro.valor = 59.90;
        System.out.println("Valor atual: " + livro.valor);

        // livro.valor -= livro.valor * 0.1;
        if (!livro.aplicaDescontoDe(0.51)){
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com o desconto:" + livro.valor);
        }
        // livro.aplicaDescontoDe(0.1);
        // livro.valor -= livro.valor * 0.4;
        // livro.aplicaDescontoDe(0.4);
        System.out.println("Valor com desconto: " + livro.valor);
        System.out.println();

        Autor autor = new Autor();
		autor.nome = "Javerinho Torto";
		livro.autor = autor;
        livro.nome = "Livrinho de Java";
        livro.descricao = "TesteBatatinha";
        livro.isbn = "1298398312938293";
        autor.cpf = "235.896.572-15";
        autor.email = "caixamail@tomail.com";
		livro.mostrarDetalhes();
   
    }

}
