public class App {
    public static void main(String[] args) throws Exception {
        
        //Quadrilátero
        System.out.println("Exercício Quadrilátero (sobrecarga de um método)");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);
    }
}
