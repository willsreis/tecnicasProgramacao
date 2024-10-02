public class Autor {
	private String nome;
	private String email;
	private String cpf;

	public void setNome(String nome){this.nome = nome;}
	public void setEmail(String email){this.email = email;}
	public void setCpf(String cpf){this.cpf = cpf;}

	void mostrarDetalhes(){
		System.out.println("Mostando detalhes do autor: ");
		System.out.println(nome);
		System.out.println(email);
		System.out.println(cpf);
		System.out.println("---------------------");
	}
}
