public class classLivro {
 
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;


void mostrarDetalhes() {
    // livro.mostrarDetalhes
    String mensagem = "Mostrando detalhes do livro";
    System.out.println(mensagem);
    System.out.println("Nome: "+nome);
    System.out.println("Descrição: " +descricao);
    System.out.println("Valor: " +valor);
    System.out.println("ISBN: " +isbn);
    System.out.println();
     String mensagem2 = "Mostrando detalhes do autor";
    System.out.println(mensagem2);
    System.out.println("Nome: "+ autor.nome);
    System.out.println("E-mail: "+autor.email);
    System.out.println("CPF: " +autor.cpf);
    System.out.println();

}
}

