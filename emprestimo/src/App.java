import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Qual o valor do empréstimo? ");

        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        System.out.print("Em quantas vezes? ");
        float parcela = teclado.nextFloat();

        System.out.println("Total com juros será: " + taxas(valor, parcela));
        
    }

    public static float taxas(int dinheiro, Float vezes) {
        
        float juros = (float) (vezes * ((dinheiro / 100 * 1.5)));
        float total = dinheiro + juros;
        return total;
    }
}
