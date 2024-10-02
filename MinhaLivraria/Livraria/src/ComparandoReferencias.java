import RefatLivraria.Autor;

public class ComparandoReferencias {

    public static void main(String[] args) {
        

        Autor autor = new Autor();
        autor.setNome("testeteste teste");
        autor.setEmail("teste@abcteste.com");
        autor.setCpf("123.456.789.10");
        
        Autor autor2 = new Autor();
        autor2.setNome("testeteste teste");
        autor2.setEmail("teste@abcteste.com");
        autor2.setCpf("123.456.789.10");

        if (autor == autor2) {
            System.out.println("Iguais");
        }
        else{
            System.out.println("Diferentes");
        }

    }
}
