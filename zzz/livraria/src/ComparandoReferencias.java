
public class ComparandoReferencias {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "testeteste teste";
        autor.email = "teste@abcteste.com";
        autor.cpf = "123.456.789.10";
        
        Autor autor2 = new Autor();
        autor2.nome = "testeteste teste";
        autor2.email = "teste@abcteste.com";
        autor2.cpf = "123.456.789.10";

        if (autor == autor2) {
            System.out.println("Iguais");
        }
        else{
            System.out.println("Diferentes");
        }

    }
}
