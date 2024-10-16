public class Livraria {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-99");

		Livro livro = new Livro(autor);
		livro.setNome("Java 8 Prático");
		livro.setValor(59.90);
		livro.setDescricao("Novos Recursos da Linguagem");
		livro.setIsbn("978-85-66250-46-6");
		livro.setAutor(autor);

		Autor outroautor = new Autor();
		outroautor.setNome("Paulo Silveira");
		outroautor.setEmail("paulo.silveira@caelum.com.br");
		outroautor.setCpf("109.876.543-00");

		Livro outrolivro = new Livro(outroautor);
		outrolivro.setNome("Lógica de Programação");
		outrolivro.setValor(59.90);
		outrolivro.setDescricao("Crie seus primeiros programas");
		outrolivro.setIsbn("123-45-67890-50-1");
		outrolivro.setAutor(outroautor);
		
		livro.mostrarDetalhes();
		outrolivro.mostrarDetalhes();

		

		System.out.println("Valor atual: "+livro.getValor());
		if(!livro.aplicaDescontoDe(0.1)){
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		else{
			System.out.println("Valor com desconto: "+livro.getValor());
		}

		System.out.println("Valor atual: "+livro.getValor());
		if(!livro.aplicaDescontoDe(0.4)){
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		else{
			System.out.println("Valor com desconto: "+livro.getValor());
		}

		System.out.println("_____----_____");
		Autor ebookAutor = new Autor();
		ebookAutor.setNome("Jaiminho Livreiro");
		ebookAutor.setEmail("Jayminhoroots@crazydog.com");
		ebookAutor.setCpf("256.548.569-56");
		Ebook ebook = new Ebook(ebookAutor);
		ebook.setNome("Ebook Cachoera rasa 002");
		ebook.setValor(40.00);
		ebook.setDescricao("Como ser vida loka parte 2");
		ebook.setIsbn("256-56-45698-21-3");

		System.out.println("Valor atual: "+ebook.getValor());
		if(!ebook.aplicaDescontoDe(0.15)){
			System.out.println("Desconto não pode ser maior que 15%");
		}
		else{
			System.out.println("Valor com desconto: "+ebook.getValor());
		}


		ebook.mostrarDetalhes();


	}
}
