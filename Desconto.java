public class Desconto {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.valor = 59.90;
        System.out.println("Valor atual: " + livro.valor);
        livro.valor -= livro.valor * 0.1;
        System.out.println("Valor com desconto: " + livro.valor);
    }

}
