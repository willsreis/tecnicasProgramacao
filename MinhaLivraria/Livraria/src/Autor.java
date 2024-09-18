public class Autor {
    String nome;
    String email;
    String cpf;
    public void mostrarDetalhes() {
		System.out.println("Exibindo detalhes sobre o autor");
		System.out.println("Nome do autor: "+ this.nome);
		System.out.println("Contato do autor: "+ this.email);
		System.out.println("CPF do autor: "+ this.cpf);
	}
}
