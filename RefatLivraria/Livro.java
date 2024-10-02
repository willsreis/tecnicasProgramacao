public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro(Autor autor){
		this();
		this.autor=autor;
	}

	public Livro(){
		this.isbn="000-00-00000-00-0";
	}
	
	public void mostrarDetalhes(){
		String mensagem = "Estou mostrando detalhes do livro:";
		System.out.println(mensagem);
		System.out.println("O nome do livro é:"+nome);
		System.out.println("Descrição: "+descricao);
		System.out.println("Valor: "+valor);
		System.out.println("isbn: "+isbn);
		if(this.temAutor()){
			autor.mostrarDetalhes();
		}
	}

	public boolean aplicaDescontoDe(double percentagem) {
		if(percentagem > 0.3) {
			return false;
		}
		this.valor -= this.valor * percentagem;
		return true;
	}

	public void setNome(String nome) {this.nome = nome;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	public void setValor(double preco) {this.valor = preco;}
	public void setIsbn(String isbn) {this.isbn = isbn;}
	public void setAutor(Autor autor) {this.autor = autor;}
	public double getValor() {return this.valor;}
	public boolean temAutor() {return (this.autor != null);}
}
