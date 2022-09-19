public class App {
    public static void main(String[] args) throws Exception {
        
        int x = 5;
        int y = 6;

        System.out.println(soma(x, y));
        System.out.println(subtracao(x, y));
        System.out.println(multiplicação(x, y));
        System.out.println(divisao(x, y));

    }

    public static int soma(int n1, int n2){

        int totSoma = n1 + n2;
        return totSoma;
    }

    public static int subtracao(int n1, int n2){

        int totSubtracao = n1 - n2;
        return totSubtracao;
    }

    public static int multiplicação(int n1, int n2) {

        int totMult = n1 * n2;
        return totMult;        
    }

    public static float divisao(int n1, int n2){
        float x = (float) n1;
        float y = (float) n2;
        float totDiv = x / y;
        return totDiv;
    }
}
