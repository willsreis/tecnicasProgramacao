public class classLivro {
 
    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor;
    public classLivro(){
        System.out.println("novo livro criado");
    }


void mostrarDetalhes() {
    // livro.mostrarDetalhes
    String mensagem = "Mostrando detalhes do livro";
    System.out.println(mensagem);
    System.out.println("Nome: "+nome);
    System.out.println("Descrição: " +descricao);
    System.out.println("Valor: " +valor);
    System.out.println("ISBN: " +isbn);
    if(this.temAutor()){
        autor.mostrarDetalhes();
    }
    System.out.println();


}
public boolean  aplicaDescontoDe(double porcentagem){
    if (porcentagem > 0.3){
        return false;
    } 
    this.valor -= this.valor * porcentagem;
    return true;
}
public boolean temAutor(){
    return (this.autor != null);
}
public void adicionaValor(double preco){
    this.valor = preco;
}
public double retornaValor(){
    return this.valor;
    
}
}


