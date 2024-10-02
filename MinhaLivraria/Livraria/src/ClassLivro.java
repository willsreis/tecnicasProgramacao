
public abstract class ClassLivro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    // private boolean impresso;

    public ClassLivro(Autor autor) {
        if (autor == null) {
            throw new AutorNuloException("O autor do livro não pode ser nulo");
        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        // this.impresso = true;

    }

    void mostrarDetalhes() {
        // livro.mostrarDetalhes
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--");

    }

    public boolean temAutor() {
        return (this.autor != null);
    }

    public double getValor() {
        return valor;

    }

    public void setValor(double preco) {
        this.valor = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int compareTo(Produto outro) {

        if (this.getValor() < outro.getValor()) {
            return -1;
        }
        if (this.getValor() > outro.getValor()) {
            return 1;
        }
        return 0;

    }

public boolean aplicaDescontoDe(double porcentagem) {
    if (porcentagem > 0.3) {
        return false;
    } 
    // else if (!this.impresso && porcentagem > 0.15) {
    //     return false;
    // }
    this.valor -= this.valor * porcentagem;
    return true;
}

}

