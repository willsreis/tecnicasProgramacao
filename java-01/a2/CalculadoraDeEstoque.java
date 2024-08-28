public class CalculadoraDeEstoque {
    public static void main (String[] args){
        double livroJava8 = 59.90;
        double livroTDD = 159.90;   

        double soma = livroJava8 + livroTDD;
        System.out.println("O total de livros é " + soma);

        if (soma < 150) {
        System.out.println("o total nao tem direito a desconto");
        } else {
            System.out.println("O total garante desconto de 10%");
        }

        int contador = 0;
        
        while (contador <5) {
            contador ++;
            double valorLivro = livroJava8;
            soma += valorLivro;
            contador++;
            System.out.println("contador: " + contador);
        }

        for (int i =0; i <= 10; i++) {
            if (i ==7){
                continue;
            }
            System.err.println(i);
        }

        for (int i =0; i <= 10; i++) {
            if (i ==7){
                break;
            }
            System.err.println(i);
        }

    }
}